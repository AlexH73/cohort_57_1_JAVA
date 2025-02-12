package Practice.Practice_23;

import java.util.Objects;

//[х] TODO: Реализовать геттеры и сеттеры с валидацией.
// 1. Поле `rating` должно быть от 1 до 5.
// 2. Поле `reviewText` не должно быть пустым.
public class ProductReview {
    private String productName;
    private int rating;
    private String reviewText;

    // Геттер для productName
    public String getProductName() {
        return productName;
    }

    // Геттер для rating
    public int getRating() {
        return rating;
    }

    // Сеттер для rating с валидацией
    public void setRating(int rating) {
        if (rating < 1 || rating > 5) {
            System.out.println("Рейтинг может быть только от 1 до 5.");
        }
        this.rating = rating;
    }

    // Геттер для reviewText
    public String getReviewText() {
        return reviewText;
    }

    // Сеттер для reviewText с валидацией
    public void setReviewText(String reviewText) {
        if (Objects.equals(reviewText, "") || reviewText == null) {
            System.out.println("Поле ´Описание´ не может быть пустым.");
        }
        this.reviewText = reviewText;
    }
}
