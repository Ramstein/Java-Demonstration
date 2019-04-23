//import javafx.application.Platform;
//
//import javax.print.attribute.standard.Media;
//import java.util.Timer;
//import java.util.concurrent.ScheduledExecutorService;
//
//abstract class MediaTrack {
//    //ScheduledExecutorService uiScheduler;
//    double length;
//    Timer timer;
//    Platform pt;
//
//    Player player;
//
//
//
//    public MediaTrack(double length, String fileUrl, ScheduledExecutorService uiScheduler) {
//        this.length = length;
//        this.timer = uiScheduler;
//        Media media = new Media(fileUrl);
//        Platform.runLater(() -> {
//            player = new MediaPlayer(media);
//            player.setOnError(() ->
//                    logger.error("Failed to play media "+fileUrl, player.getError())
//            );
//            player.setOnEndOfMedia(this::stop
//            );
//        });
//    }
//
//}
