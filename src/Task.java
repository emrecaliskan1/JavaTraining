public class Task {
    private int id;
    private String aciklama;
    private boolean isCompleted;

    public Task(int id, String aciklama){
        this.id = id;
        this.aciklama=aciklama;
        isCompleted = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Override
    public String toString(){
        return id + " " + aciklama + " (Completed: " + isCompleted + ")";
    }
}
