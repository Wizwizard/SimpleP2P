import java.io.File;

/*
Store the public constant
 */

public class Constant {
    // Server Config
    public static final String SERVER_PORT = "1900";
    public static final String SERVER_ADDRESS = "127.0.0.1";
    public static final String CENTRAL_RMI_ADDRESS = "rmi://localhost:";

    // Base
    public static final String BASE_DIR = (new File("")).getAbsolutePath() + "\\static\\";
    public static final int MAX_DISTANCE = 99999999;

    // Thread
    public static final int PEER_MIN_THREAD = 2;
    public static final int PEER_MAX_THREAD = 10;

    // NetCode
    public static final String DOWNLOAD_REQUEST = "Download";
    public static final String REQEUST_SUCCESS = "Success";
    public static final String FILE_NOT_FOUND = "FileNotFound";
}
