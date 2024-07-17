package com.ohgiraffers.section03.primarykey.subsection01.identity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;



//@Entity(name = "member_section03_sub01")
@Table(name = "tbl_member_section03_sub01")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Member {



    @Id
    @Column(name = "member_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberNo;

    @Column(name = "member_id")
    private String memberId;

    @Column(name = "member_pwd", length = 100)
    private String memberPwd;

    @Column(name = "nickname")
    @Transient // 테이블 생성시 무시
    private String nickname;

    //columnDefinition
    @Column(name = "phone", columnDefinition = "varchar(200) default '010-0000-0000'")
    private String phone = "010-0000-0000";

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "enroll_date")
    private LocalDate enrollDate;

    @Column(name = "member_role")
    private String memberRole;

    @Column(name = "status")
    private String status;


}
