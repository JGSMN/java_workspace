package section13.anonymous_class;

interface ButtonClickListener {
  public void click();

}

public class AnonymousExample {
  public class Button {
    private ButtonClickListener listener;

    public void setButtonListener(ButtonClickListener listener) {
      this.listener = listener;
    }

    public void click() {
      if (listener != null) {
        this.listener.click();
      }
    }
  }

  public static void main(String[] args) {
    AnonymousExample exam = new AnonymousExample();
    AnonymousExample.Button button = exam.new Button();
    button.click();

    button.setButtonListener(new ButtonClickListener() {
      @Override
      public void click() {
        System.out.println("버튼을 눌렀습니다.");
      }
    });
    button.click();
  }
}
