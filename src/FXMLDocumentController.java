//
//
//
//
//
//import javafx.fxml.FXML;
//import javafx.scene.control.Label;
//import javafx.fxml.Initializable;
//import javafx.scene.media.MediaPlayer;
//import javafx.scene.media.MediaView;
//import javafx.stage.FileChooser;
//
//import javax.swing.*;
//import javax.swing.plaf.FileChooserUI;
//import java.awt.event.ActionEvent;
//import java.io.File;
//import java.util.ResourceBundle;
//
///*
//
//
//
// */
//
//abstract class FXMLDocumentController implements Initializable{
//
//    private String filePath;
//    private MediaPlayer player;
//
//
//
//    @FXML
//    private Label label;
//
//    @FXML
//    private MediaView mediaView;
//
//    @FXML
//    private void handleButtonAction(ActionEvent ae){
//        FileChooser fileChooser = new FileChooser();
//        FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("mp4 file please", ".mp4")
//
//        fileChooser.getExtensionFilters().add(filter);
//
//        File file= fileChooser.showOpenDialog(null);
//        filePath = file.toURI().toString();
//        if(filePath != null){
//            Media media = new Media("hjhkjh");
//            player = new MediaPlayer(media);
//
//            mediaView.setMediaPlayer(player);
//            player.play();
//
////        public MediaTrack(double length, String fileUrl, ScheduledExecutorService uiScheduler) {
////            this.length = length;
////            this.timer = uiScheduler;
////            Media media = new Media(fileUrl);
////            Platform.runLater(() -> {
////                player = new MediaPlayer(media);
////                player.setOnError(() ->
////                        logger.error("Failed to play media "+fileUrl, player.getError())
////                );
////                player.setOnEndOfMedia(this::stop
////                );
////            });
//
//
//
//
//    }
//
//    @Override
//    public void initializable (url, ResourceBundle){
//        //TODO
//
//
//    }
//
//
//}
