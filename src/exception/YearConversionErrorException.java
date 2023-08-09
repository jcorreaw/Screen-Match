package exception;

public class YearConversionErrorException extends RuntimeException {
    private String msg;
    public YearConversionErrorException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }
}
