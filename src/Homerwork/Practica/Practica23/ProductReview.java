package Homerwork.Practica.Practica23;
// 1. Поле `rating` должно быть от 1 до 5.
// 2. Поле `reviewText` не должно быть пустым.
public class ProductReview {
    private String productName;
    private int rating;
    private String reviewText;

    public String getProductName() {
        return productName;
    }

    public int getRating() {
        return rating;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setRating(int rating) {
        if (rating >= 1 && rating >= 5) {
            this.rating = rating;
        } else {
            throw new IllegalArgumentException("Рейтинг товара должен быть от 1 до 5");
        }
    }

    public void setReviewText( String reviewText) {
            if (reviewText != null && !reviewText.trim().isEmpty()) {
                this.reviewText = reviewText;
            } else {
                throw new IllegalArgumentException("Текст озыва не должен быть пустым");
            }
    }

}

