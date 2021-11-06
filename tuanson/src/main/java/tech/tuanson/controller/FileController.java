// package tech.tuanson.controller;

// import java.util.ArrayList;
// import java.util.List;

// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RestController;

// import tech.tuanson.model.FileResponse;


// @RestController
// public class FileController {
    
//     @GetMapping("/files")
//     public ResponseEntity<List<FileResponse>> getFiles() {
//         List<FileResponse> files = new ArrayList<>();
//         return ResponseEntity.status(HttpStatus.OK).body(files);
//     }
//     @GetMapping("/files/{id}")
//     public ResponseEntity<byte[]> getFiles(@PathVariable long id){
//         FileEntity fileEntity = null;
//         return ResponseEnity.ok(HttpHeaders.CONTENT_,"attachment; filename=\"" + fileEntity.getName() + "\");
//                             .body(fileEntity.get)
//     }

// }
