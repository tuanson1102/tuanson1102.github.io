// package tech.tuanson.service;

// import java.io.IOException;
// import java.util.List;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import org.springframework.util.StringUtils;
// import org.springframework.web.multipart.MultipartFile;

// import tech.tuanson.model.FileEntity;
// import tech.tuanson.model.FileResponse;

// @Service
// public class FileServiceImpl implements FileService {
//     @Autowired
//     private FileResponse fileRepo;
//     @Override
//     public FileEntity store(MultipartFile file , String description) throws IOException {
//         FileEntity fileEntity = FileEntity.builder().withName(StringUtils.cleanPath(file.getOriginalFilename()))
//         .withType(file.getContentType()).withDescription(description).withContent(file.getBytes()).build();
//         return fileRepo.save(fileEntity);
//     }

//     @Override
//     public FileEntity getFile(Long id) {
//         // TODO Auto-generated method stub
//         return fileRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("file not found for this file: "+ id));
//     }

//     @Override
//     public List<FileResponse> getFiles() {
//         // TODO Auto-generated method stub
//         return null;
//     }
    
// }
