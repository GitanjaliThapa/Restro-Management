package com.gitanjali.restromanagement.mapper;

import com.gitanjali.restromanagement.dto.auth.RegisterRequest;
import com.gitanjali.restromanagement.dto.auth.UserResponse;
import com.gitanjali.restromanagement.entity.User;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "password", ignore = true)
    @Mapping(target = "isActive", constant = "true")
    @Mapping(target = "isEmailVerified", constant = "false")
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    User toEntity(RegisterRequest request);

    UserResponse toResponse(User user);
}