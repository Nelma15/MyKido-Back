package fr.MyKido.dto;

public class AuthResponseDTO {
    private String accessToken;
    private String role;

    public AuthResponseDTO(String accessToken, String role) {
        this.accessToken = accessToken;
        this.role = role;
    }

    public AuthResponseDTO() {
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    

}
    


