package com.vtravel.wechat.controller;

import java.util.Map;

import javax.validation.Valid;
import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "wechat - vtravel", consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
@RestController
@RequestMapping("/")
public class RESTWechatController {
	
	//@Validated
	@ApiOperation(value = "/book", httpMethod = "POST", response = ResponseEntity.class)
	@RequestMapping(value="/book", method=RequestMethod.POST)
	public ResponseEntity<?> book(@RequestHeader(value="accesstoken") String clientCard, @RequestHeader Map<String, String> header) throws Exception {
		return new ResponseEntity("This is a test", HttpStatus.OK);
	}


}
