package lk.ijse.dep11.edupanel.to.request;

import lk.ijse.dep11.edupanel.validation.LecturerImage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Part;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LecturerReqTO {
//    @NotBlank(message = "name can't be empty")
//    @Pattern(regexp = "^[A-Za-z]+$", message = "In valid Message")
//    private String name;
//    @NotBlank(message = "Designation cant be empty")
//    @Length(min = 2, message = "Invalid Designation")
//    private String designation;
//    @NotBlank(message = "Qualification cant be empty")
//    @Length(min = 2, message = "Invalid qualification")
//    private String qualification;
//    @NotBlank(message = "type cant be empty")
//    @Pattern(regexp = "^(full-time|part-time)$", flags = Pattern.Flag.CASE_INSENSITIVE, message = "invalid pattern")
//    private String type;
//    @LecturerImage
//    private MultipartFile picture;
//    @Pattern(regexp = "^http[s]?://.+$", message = "Invalid linkedin url")
//    private String linkedIn;
    @NotBlank(message = "Name can't be empty")
    @Pattern(regexp = "^[A-Za-z ]+$",message = "Invalid name: {value}") // here the value is up cumming to name
    private String name;
    @NotBlank(message = "Designation can't be empty")
    @Length(min = 2,message = "Invalid designation: ${value}")
    private String designation;
    @NotBlank(message = "Qualification can't be empty")
    @Length(min = 2,message = "Invalid qualification")
    private String qualification;
    @NotNull(message = "Type can't be empty")
    @Pattern(regexp = "^(full-time|part-time)$",flags = Pattern.Flag.CASE_INSENSITIVE,message = "Invalid type")
    private String type;
    @LecturerImage(maximumFileSize = 600*1024)
    private MultipartFile picture;
    @Pattern(regexp = "^http[s]?://.+$",message = "Invalid linkedin url")
    private String linkedin;
}
