package com.github.hollykunge.security.elasticsearch.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.elasticsearch.annotations.Document;

import com.alibaba.fastjson.annotation.JSONField;

import io.searchbox.annotations.JestId;

/**
 * elasticsearch 消息实体类
 * @author fansq
 *@Field(type = FieldType.Text, analyzer = "ik_max_word",searchAnalyzer = "ik_max_word")
 *@JsonFormat(shape = JsonFormat.Shape.STRING, pattern ="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
 */
@Document(indexName="",type="")
public class ZzGroupMsg implements Serializable{


	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JestId
	private String MSG_ID;
	private String IS_DELETE;
	 private String IS_IMPORTANT;
	 private Long LEVELS;
	 private String MSG;
	 private String MSG_PATH;
	 private String MSG_RECEIVER;
	 private String MSG_SENDER;
	 private Long MSG_TYPE;
	 @JSONField( format ="yyyy-MM-dd HH:mm:ss")
	 private Date SEND_TIME;
	public String getIS_DELETE() {
		return IS_DELETE;
	}
	public void setIS_DELETE(String iS_DELETE) {
		IS_DELETE = iS_DELETE;
	}
	public String getIS_IMPORTANT() {
		return IS_IMPORTANT;
	}
	public void setIS_IMPORTANT(String iS_IMPORTANT) {
		IS_IMPORTANT = iS_IMPORTANT;
	}
	public Long getLEVELS() {
		return LEVELS;
	}
	public void setLEVELS(Long lEVELS) {
		LEVELS = lEVELS;
	}
	public String getMSG() {
		return MSG;
	}
	public void setMSG(String mSG) {
		MSG = mSG;
	}
	public String getMSG_ID() {
		return MSG_ID;
	}
	public void setMSG_ID(String mSG_ID) {
		MSG_ID = mSG_ID;
	}
	public String getMSG_PATH() {
		return MSG_PATH;
	}
	public void setMSG_PATH(String mSG_PATH) {
		MSG_PATH = mSG_PATH;
	}
	public String getMSG_RECEIVER() {
		return MSG_RECEIVER;
	}
	public void setMSG_RECEIVER(String mSG_RECEIVER) {
		MSG_RECEIVER = mSG_RECEIVER;
	}
	public String getMSG_SENDER() {
		return MSG_SENDER;
	}
	public void setMSG_SENDER(String mSG_SENDER) {
		MSG_SENDER = mSG_SENDER;
	}
	public Long getMSG_TYPE() {
		return MSG_TYPE;
	}
	public void setMSG_TYPE(Long mSG_TYPE) {
		MSG_TYPE = mSG_TYPE;
	}
	public Date getSEND_TIME() {
		return SEND_TIME;
	}
	public void setSEND_TIME(Date sEND_TIME) {
		SEND_TIME = sEND_TIME;
	}
	@Override
	public String toString() {
		return "ZzGroupMsg [IS_DELETE=" + IS_DELETE + ", IS_IMPORTANT=" + IS_IMPORTANT + ", LEVELS=" + LEVELS + ", MSG="
				+ MSG + ", MSG_ID=" + MSG_ID + ", MSG_PATH=" + MSG_PATH + ", MSG_RECEIVER=" + MSG_RECEIVER
				+ ", MSG_SENDER=" + MSG_SENDER + ", MSG_TYPE=" + MSG_TYPE + ", SEND_TIME=" + SEND_TIME + "]";
	}
	public ZzGroupMsg(String iS_DELETE, String iS_IMPORTANT, Long lEVELS, String mSG, String mSG_ID, String mSG_PATH,
			String mSG_RECEIVER, String mSG_SENDER, Long mSG_TYPE, Date sEND_TIME) {
		super();
		IS_DELETE = iS_DELETE;
		IS_IMPORTANT = iS_IMPORTANT;
		LEVELS = lEVELS;
		MSG = mSG;
		MSG_ID = mSG_ID;
		MSG_PATH = mSG_PATH;
		MSG_RECEIVER = mSG_RECEIVER;
		MSG_SENDER = mSG_SENDER;
		MSG_TYPE = mSG_TYPE;
		SEND_TIME = sEND_TIME;
	}
	public ZzGroupMsg() {
	}
	 
	 

//	private static final long serialVersionUID = -87069741670583916L;
//    //消息id
//	@JestId
//    private String msgId;
//    //消息发出者
//    private String msgSender;
//    //消息接收者
//    private String msgReceiver;
//    //消息发出时间
//    private Date sendTime;
//    //消息内容
//    private String msg;
//    //消息类型（text：文本；img：图片：emoji：表情；file：文件）
//    private String msgType;
//    //如果是图片或者文件，存储文件路径
//    private String msgPath;
//    //0
//    private String isDelete;
//    //0  --是否重要信息--,
//    private String isImportant;
//    //密级
//    private String levels;
//
//
//    public String getMsgId() {
//        return msgId;
//    }
//
//    public void setMsgId(String msgId) {
//        this.msgId = msgId;
//    }
//
//    public String getMsgSender() {
//        return msgSender;
//    }
//
//    public void setMsgSender(String msgSender) {
//        this.msgSender = msgSender;
//    }
//
//    public String getMsgReceiver() {
//        return msgReceiver;
//    }
//
//    public void setMsgReceiver(String msgReceiver) {
//        this.msgReceiver = msgReceiver;
//    }
//
//    public Date getSendTime() {
//        return sendTime;
//    }
//
//    public void setSendTime(Date sendTime) {
//        this.sendTime = sendTime;
//    }
//
//    public String getMsg() {
//        return msg;
//    }
//
//    public void setMsg(String msg) {
//        this.msg = msg;
//    }
//
//    public String getMsgType() {
//        return msgType;
//    }
//
//    public void setMsgType(String msgType) {
//        this.msgType = msgType;
//    }
//
//    public String getMsgPath() {
//        return msgPath;
//    }
//
//    public void setMsgPath(String msgPath) {
//        this.msgPath = msgPath;
//    }
//
//    public String getIsDelete() {
//        return isDelete;
//    }
//
//    public void setIsDelete(String isDelete) {
//        this.isDelete = isDelete;
//    }
//
//    public String getIsImportant() {
//        return isImportant;
//    }
//
//    public void setIsImportant(String isImportant) {
//        this.isImportant = isImportant;
//    }
//
//    public String getLevels() {
//        return levels;
//    }
//
//    public void setLevels(String levels) {
//        this.levels = levels;
//    }
//
//	@Override
//	public String toString() {
//		return "ZzGroupMsg [msgId=" + msgId + ", msgSender=" + msgSender + ", msgReceiver=" + msgReceiver
//				+ ", sendTime=" + sendTime + ", msg=" + msg + ", msgType=" + msgType + ", msgPath=" + msgPath
//				+ ", isDelete=" + isDelete + ", isImportant=" + isImportant + ", levels=" + levels + "]";
//	}

  
}
