// package tech.tuanson.model;
// import org.springframework.boot.autoconfigure.domain.EntityScan;

// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.Table;

// import lombok.AllArgsConstructor;
// import lombok.Builder;
// import lombok.Data;
// import lombok.NoArgsConstructor;


// @Entity
// @Table(name = "files")
// @Data
// @NoArgsConstructor
// @AllArgsConstructor
// @Builder(setterPrefix = "with", toBuilder = true)
// public class FileEntity {
//     @Id 
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     @Column(name = "file_id")
//     private Long id;
//     private String name;
//     private String type;
//     private String description;
//     private byte[] content;

// }
