// package com.brincandocomspringboot.springboot.service;


// import lombok.extern.slf4j.Slf4j;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.http.ResponseEntity;
// import org.springframework.stereotype.Component;
// import org.springframework.stereotype.Service;
// import org.springframework.web.multipart.MultipartFile;

// import java.io.File;
// import java.io.FileOutputStream;
// import java.math.BigDecimal;
// import java.util.Arrays;
// import java.util.List;
// import java.util.Objects;
// import java.util.stream.Collectors;

// import static org.springframework.util.Assert.notNull;

// @Service
// @Component
// @Slf4j
// public class SwaggerService {

//     @Value("${path.documents}")
//     private String path;

//     public ResponseEntity<String> uploadDocument(MultipartFile file) {
//         try{
//             notNull(file, "arquivo é obrigatório!");

//             String rootFile = path + "/" + file.getOriginalFilename();
//             File newDocument = new File(rootFile);
//             FileOutputStream fileOutputStream = new FileOutputStream(newDocument, true);

//             file.getInputStream().transferTo(fileOutputStream);
//             return ResponseEntity.ok("Arquivo carregado " + file.getName());
//         } catch (Exception e) {
//             throw new RuntimeException("Erro ao carregar arquivo");
//         }
//     }

// }