package pl.coderslab.beans;

public class MessageSender {
    private MessageService messageService;
    private String message;

    public MessageSender(MessageService messageService) {
        this.messageService = messageService;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void sendMessage() {
        messageService.send();
    }

    public void sendMessageFromProperty() {
        messageService.send(message);
    }
}
