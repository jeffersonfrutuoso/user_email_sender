package dev.frutuoso.email.domain;
import dev.frutuoso.email.enums.EmailStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_email")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmailModel {
    private final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID emailId;
    private UUID userId;
    private String emailFom;
    private String emailTo;
    private String emailSubject;

    @Column(columnDefinition = "BODY")
    private String Body;
    private LocalDateTime sendDateEmail;
    private EmailStatus emailStatus;
}
