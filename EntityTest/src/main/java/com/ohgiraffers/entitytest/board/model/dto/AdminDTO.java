package com.ohgiraffers.entitytest.board.model.dto;


import lombok.*;

import java.sql.Date;


@Setter
@Getter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class AdminDTO {
    private int AdminNo;
    private String nickName;
    private String AdminPwd;
    private String Phone;
    private String Email;
    private Date RegDate;
    private String AdminAccount;

}
