// package com.brincandocomspringboot.springboot.controller;


// import io.swagger.v3.oas.annotations.Operation;
// import io.swagger.v3.oas.annotations.responses.ApiResponse;
// import io.swagger.v3.oas.annotations.responses.ApiResponses;
// import io.swagger.v3.oas.annotations.tags.Tag;
// import lombok.extern.slf4j.Slf4j;
// import org.springframework.http.MediaType;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;
// import org.springframework.web.multipart.MultipartFile;

// import com.brincandocomspringboot.springboot.model.User;
// import com.brincandocomspringboot.springboot.service.SwaggerService;
// import com.brincandocomspringboot.springboot.service.UserService;

// import java.util.List;

// import static java.lang.String.format;

// @RestController
// @Slf4j
// @RequestMapping(value = "/teste-open-api", produces = {"application/json"})
// @Tag(name = "open-api")
// public class SwaggerController {

//     private final SwaggerService swaggerServiceservice;
//     private final UserService userService;

//     public SwaggerController(SwaggerService service) {
//         this.swaggerServiceservice = service;
//         this.userService = new UserService();
//     }

//     @Operation(summary = "Realiza o upload de arquivos", method = "POST")
//     @ApiResponses(value = {
//             @ApiResponse(responseCode = "200", description = "Upload de arquivo realizado com sucesso"),
//             @ApiResponse(responseCode = "422", description = "Dados de requisição inválida"),
//             @ApiResponse(responseCode = "400", description = "Parametros inválidos"),
//             @ApiResponse(responseCode = "500", description = "Erro ao realizar o upload de arquivo"),
//     })
//     @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//     public ResponseEntity<String> uploadDocuments(@RequestPart MultipartFile file) {
//         log.info(format("Upload do arquivo %s iniciado!", file.getOriginalFilename()));

//         return swaggerServiceservice.uploadDocument(file);

//     }

//     @Operation(summary = "Busca dados de profissionais por idade e cargo exercido", method = "GET")

//     @ApiResponses(value = {
//             @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso"),
//             @ApiResponse(responseCode = "422", description = "Dados de requisição inválida"),
//             @ApiResponse(responseCode = "400", description = "Parametros inválidos"),
//             @ApiResponse(responseCode = "500", description = "Erro ao realizar busca dos dados"),
//     })
    
// }