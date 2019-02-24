public class ResearchAssistant extends Person implements Mailable {

    public int researchAssistantId;

    public String getMailAddress(int researchAssistantId){
        return "";
    }

    public ResearchAssistant (String firstName, String surName, String birthday, int researchAssistantId){
        super(firstName , surName, birthday);
        this.researchAssistantId = researchAssistantId;
    }

    @Override
    public int getIdentifier() {
        return researchAssistantId;
    }

    @Override
    public String getMailAddress(){
      return firstName + "." + surName + "@uni-fictitious.de";
    }

}
