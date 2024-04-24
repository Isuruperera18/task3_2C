package sit707_tasks;
import org.junit.Assert;
import org.junit.Test;

public class EnquirySubmissionPageTest {

    @Test
    public void testValidKeywords() {
        EnquirySubmissionPage page = new EnquirySubmissionPage();
        String validKeywords = "student affairs";
        boolean isValid = page.isValidKeywords(validKeywords);
        Assert.assertTrue(isValid);
    }

    @Test
    public void testInvalidKeywords() {
        EnquirySubmissionPage page = new EnquirySubmissionPage();
        String invalidKeywords = ""; // Empty keywords
        boolean isValid = page.isValidKeywords(invalidKeywords);
        Assert.assertFalse(isValid);
    }

    @Test
    public void testSelectTopic() {
        EnquirySubmissionPage page = new EnquirySubmissionPage();
        String selectedTopic = "Student Services";
        boolean isSelected = page.isTopicSelected(selectedTopic);
        Assert.assertTrue(isSelected);
    }

    @Test
    public void testNoTopicSelected() {
        EnquirySubmissionPage page = new EnquirySubmissionPage();
        String selectedTopic = null; // No topic selected
        boolean isSelected = page.isTopicSelected(selectedTopic);
        Assert.assertFalse(isSelected);
    }

    @Test
    public void testValidEnquiryDetails() {
        EnquirySubmissionPage page = new EnquirySubmissionPage();
        String enquiryDetails = "I need information about student counseling services.";
        boolean isValid = page.isValidEnquiryDetails(enquiryDetails);
        Assert.assertTrue(isValid);
    }

    @Test
    public void testInvalidEnquiryDetails() {
        EnquirySubmissionPage page = new EnquirySubmissionPage();
        String enquiryDetails = ""; // Empty enquiry details
        boolean isValid = page.isValidEnquiryDetails(enquiryDetails);
        Assert.assertFalse(isValid);
    }

    @Test
    public void testValidAttachments() {
        EnquirySubmissionPage page = new EnquirySubmissionPage();
        String[] attachments = {"document1.pdf", "image.jpg"};
        boolean isValid = page.isValidAttachments(attachments);
        Assert.assertTrue(isValid);
    }

    @Test
    public void testNoAttachments() {
        EnquirySubmissionPage page = new EnquirySubmissionPage();
        String[] attachments = {}; // No attachments
        boolean isValid = page.isValidAttachments(attachments);
        Assert.assertTrue(isValid); // Assuming no attachments are also valid
    }
}
