package com.msg.service;

import com.msg.entity.Message;
import com.msg.entity.SendRecord;

import java.util.List;

/**
 * Created by wd on 2018/3/8.
 */
public interface MessageService {
    Integer insertMessage(Message message);
    Integer deleteMessage(Message message);
    Integer updateMessage(Message message);
    Message selectMessageById(Long messageId);
    List<Message> selectAllMessages();
    Integer insertSendRecord(SendRecord sendRecord);
    Integer deleteSendRecord(SendRecord sendRecord);
    Integer updateSendRecord(SendRecord sendRecord);
    SendRecord selectSendRecordById(Long sendRecordId);
    List<SendRecord> selectAllSendRecord();
}
