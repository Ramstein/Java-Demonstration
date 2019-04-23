//import java.util.concurrent.ScheduledExecutorService;
//
//public class MediaPlayer {
//    ScheduledExecutorService uiScheduler;
//
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
//}
