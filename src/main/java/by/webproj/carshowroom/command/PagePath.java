package by.webproj.carshowroom.command;

public enum PagePath {
    MAIN_PAGE("/WEB-INF/jsp/main.jsp"), LOGIN_PAGE("/WEB-INF/jsp/login.jsp"), INDEX_PATH("/"),
    REGISTRATION_PAGE("/WEB-INF/jsp/registration.jsp"),
    ADD_REQUEST_PAGE("/WEB-INF/jsp/request.jsp"), V_REQUEST("/WEB-INF/jsp/requestV.jsp"), REQ_N("/WEB-INF/jsp/reqN.jsp"), REQ_R("/WEB-INF/jsp/reqR.jsp");
    private final String path;

    PagePath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
