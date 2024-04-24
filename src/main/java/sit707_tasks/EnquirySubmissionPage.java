package sit707_tasks;

public class EnquirySubmissionPage {

    public boolean isValidKeywords(String keywords) {
        return keywords != null && !keywords.isEmpty();
    }

    public boolean isTopicSelected(String topic) {
        return topic != null;
    }

    public boolean isValidEnquiryDetails(String details) {
        return details != null && !details.isEmpty();
    }

    public boolean isValidAttachments(String[] attachments) {
        return attachments != null && attachments.length > 0;
    }
}
