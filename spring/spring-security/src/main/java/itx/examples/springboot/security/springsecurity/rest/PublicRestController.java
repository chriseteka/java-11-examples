package itx.examples.springboot.security.springsecurity.rest;

import itx.examples.springboot.security.springsecurity.services.DataService;
import itx.examples.springboot.security.springsecurity.services.dto.ServerData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services/public")
public class PublicRestController {

    private static final Logger LOG = LoggerFactory.getLogger(PublicRestController.class);

    @Autowired
    private DataService dataService;

    @GetMapping("/data/all")
    public ResponseEntity<ServerData> getData() {
        LOG.info("getData: ");
        return ResponseEntity.ok().body(dataService.getSecuredData("Public"));
    }

}
