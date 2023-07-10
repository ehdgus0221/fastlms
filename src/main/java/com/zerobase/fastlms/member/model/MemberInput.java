package com.zerobase.fastlms.member.model;

import lombok.Data;
import lombok.ToString;

/* Data 어노테이션으로 Getter, Setter 지원*/
@ToString
@Data
public class MemberInput {

    private String userId;
    private String userName;
    private String password;
    private String phone;

    private String newPassword;

    private String zipcode;
    private String addr;
    private String addrDetail;


}
