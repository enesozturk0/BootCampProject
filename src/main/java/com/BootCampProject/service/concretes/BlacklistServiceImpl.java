package com.BootCampProject.service.concretes;

import com.BootCampProject.entity.Blacklist;
import com.BootCampProject.repository.BlacklistRepository;
import com.BootCampProject.service.abstracts.BlacklistService;
import com.BootCampProject.service.dtos.requests.Blacklist.CreateBlacklistRequest;
import com.BootCampProject.service.dtos.requests.Blacklist.UpdateBlacklistRequest;
import com.BootCampProject.service.dtos.responses.Blacklist.CreateBlacklistResponse;
import com.BootCampProject.service.dtos.responses.Blacklist.GetByIdBlacklistResponse;
import com.BootCampProject.service.dtos.responses.Blacklist.GetListBlacklistResponse;
import com.BootCampProject.service.dtos.responses.Blacklist.UpdateBlacklistResponse;
import com.BootCampProject.service.mappers.BlacklistMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BlacklistServiceImpl implements BlacklistService {


        private final BlacklistRepository repository;

        public BlacklistServiceImpl(BlacklistRepository repository) {
            this.repository = repository;
        }


        @Override
        public CreateBlacklistResponse add(CreateBlacklistRequest request) {
            Blacklist blackList = BlacklistMapper.INSTANCE.blackListFromCreateRequest(request);
            blackList = repository.save(blackList);
            return BlacklistMapper.INSTANCE.createResponseFromBlackList(blackList);
        }

        @Override
        public UpdateBlacklistResponse update(UpdateBlacklistRequest request) {
            Blacklist existing = repository.findById(request.id())
                    .orElseThrow(() -> new RuntimeException("BlackList not found by id: " + request.id()));

            Blacklist updated = BlacklistMapper.INSTANCE.blackListFromUpdateRequest(request);
            updated.setId(existing.getId());
            Blacklist saved = repository.save(updated);

            return BlacklistMapper.INSTANCE.updateResponseFromBlackList(saved);
        }

        @Override
        public void delete(int id) {
            Blacklist blackList = repository.findById(id).orElseThrow(() -> new RuntimeException("BlackList not found by id:"+ id));

            repository.delete(blackList);
        }

        @Override
        public GetByIdBlacklistResponse getById(int id) {
            Blacklist blackList = repository.findById(id)
                    .orElseThrow(() -> new RuntimeException("BlackList not found by id: " + id));
            return BlacklistMapper.INSTANCE.getByIdResponseFromBlackList(blackList);
        }

        @Override
        public List<GetListBlacklistResponse> getAll() {
            return repository.findAll().stream()
                    .map(BlacklistMapper.INSTANCE::getListResponseFromBlackList)
                    .collect(Collectors.toList());
        }

}
