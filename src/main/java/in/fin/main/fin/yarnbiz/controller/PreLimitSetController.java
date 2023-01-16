package in.fin.main.fin.yarnbiz.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.fin.main.fin.yarnbiz.dto.RequestDto;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/limit")
@CrossOrigin(origins = { "*" }, allowedHeaders = "*")
@Slf4j
public class PreLimitSetController {

	@GetMapping(value = "/setPreLimit")
	private Boolean setPreLimit(@RequestBody RequestDto requestDto) {
		log.info("" + requestDto);

		return Boolean.TRUE;
	}

}
