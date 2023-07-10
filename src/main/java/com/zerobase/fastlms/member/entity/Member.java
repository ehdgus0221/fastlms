package com.zerobase.fastlms.member.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Data
public class Member implements MemberCode{
    @Id
    private String userId;

    private String userName;
    private String phone;
    private String password;
    private LocalDateTime regDt;
    private LocalDateTime udtDt;    // 회원정보 수정일

    private boolean emailAuthYn;
    private LocalDateTime emailAuthDt;
    private String emailAuthKey;

    private String resetPasswordKey;
    private LocalDateTime resetPasswordLimitDt;

    // 관리자 여부를 지정할것인지
    // 회원에 따른 ROLE을 지정할것인지 (ex 회원 등급 별)
    // 등등.. 적합하게 지정해주기
    private boolean adminYn;

    private String userStatus;  // 이용가능상태, 정지 상태

    private String zipcode;
    private String addr;
    private String addrDetail;
}
