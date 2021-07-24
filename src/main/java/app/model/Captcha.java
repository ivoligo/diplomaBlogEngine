package app.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "captcha_codes")
public class Captcha {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private Date time;

    @NotNull
    private byte code;

    @Column(name = "secret_code", nullable = false)
    private byte secretCode;
}
