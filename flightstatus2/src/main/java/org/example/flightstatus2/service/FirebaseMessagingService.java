//package org.example.flightstatus2.service;
//
//import com.google.firebase.messaging.FirebaseMessaging;
//import com.google.firebase.messaging.FirebaseMessagingException;
//import com.google.firebase.messaging.Message;
//import com.google.firebase.messaging.Notification;
//import org.example.flightstatus2.model.NotificationMessage;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.HashMap;
//
//@Service
//public class FirebaseMessagingService {
//
//    @Autowired
//    private FirebaseMessaging firebaseMessaging;
//
//    public String sendNotificationByToken(NotificationMessage notificationMessage) {
//        Notification notification =  Notification
//                .builder()
//                .setTitle(notificationMessage.getTitle())
//                .setBody(notificationMessage.getBody())
//                .setImage(notificationMessage.getImage())
//                .build();
//
//        Message message = Message
//                .builder()
//                .setToken(notificationMessage.getRecipientToken())
//                .setNotification(notification)
//                .putAllData(notificationMessage.getData())
//                .build();
//
//        try{
//            firebaseMessaging.send(message);
//            return "Successfully sending message";
//        }catch(FirebaseMessagingException e){
//            e.printStackTrace();
//            return "Error sending message";
//
//        }
//    }
//}
