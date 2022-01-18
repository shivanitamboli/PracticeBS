package com.bridgelabz.bookstoreapp.dto;
        import lombok.Data;

@Data
public class ResetPassword {
    String newPassword;
    String   confirmPassword;
}