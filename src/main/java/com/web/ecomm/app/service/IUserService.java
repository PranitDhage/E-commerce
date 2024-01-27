package com.web.ecomm.app.service;

import com.web.ecomm.app.dto.AuthenticationResponse;
import com.web.ecomm.app.dto.SignInRequest;
import com.web.ecomm.app.exceptions.BusinessException;
import com.web.ecomm.app.exceptions.ResourceNotFoundException;
import com.web.ecomm.app.pojo.Credentials;
import com.web.ecomm.app.pojo.User;

import java.util.List;

public interface IUserService {

    AuthenticationResponse userSignup(User u) throws  BusinessException, ResourceNotFoundException;

    AuthenticationResponse userSignIn(SignInRequest user) throws  BusinessException, ResourceNotFoundException;

    User getProfile(int id) throws BusinessException;

    User userUpdate(int id, User u) throws  BusinessException, ResourceNotFoundException;

    List<User> getUsersListAll() throws BusinessException;

    Credentials addNewAuth(Credentials credentials) throws BusinessException;

    String changeUserActiveStatus(int user_id, int status) throws  BusinessException, ResourceNotFoundException;

    Integer getAllUserCount() throws BusinessException;
}
