package Java.Training.Practice.Day3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopingApp {
    public static void main(String[] args) {
        Item fishOil =new Item ();
        fishOil.setName("Nature's Care Australia Fish Oil, Omega 3, 1000mg, 200 Capsules");

        List<String> images = new ArrayList<>();
        images.add("https://static-01.daraz.com.np/p/23de30b8016468fbae1733ca693f1b7c.png");
        images.add("https://static-01.daraz.com.np/p/23de30b8016468fbae1733ca693f1b7c.png");
        images.add("https://static-01.daraz.com.np/p/23de30b8016468fbae1733ca693f1b7c.png");

        fishOil.setImage(images);
        fishOil.setPrice(2700);
        fishOil.setDiscounted(true);
        fishOil.setDiscountPercentage(7);

        fishOil.setPromotionImage("https://static-01.daraz.com.np/p/ba3efe3c7c3b56b2ca54afe7e133df6a.jpg");

        // Description Start
        List<ItemDescription> itemDescriptions = new ArrayList<>();
        ItemDescription description1 = new ItemDescription();
        description1.setDescription("- Department of Food Technology and Quality Control Registration Number : 01-76-77-000-62\n");
        itemDescriptions.add(description1);

        ItemDescription description2 = new ItemDescription();
        description2.setDescription("- Suitable for Children Age 6 and above.\n");
        itemDescriptions.add(description2);

        ItemDescription description3 = new ItemDescription();
        description3.setDescription("- Expiry Date : April 2024\n");
        itemDescriptions.add(description3);

        ItemDescription description4 = new ItemDescription();
        description4.setDescription("- Maintains general health and well-being.\n");
        itemDescriptions.add(description4);

        ItemDescription description5 =new ItemDescription();
        description5.setDescription("- Supports joint and eye health.\n");
        itemDescriptions.add(description5);

        fishOil.setDescription(itemDescriptions);

        //Descritption end

        List<Review> reviews = new ArrayList<>();

        Review review1 = new Review();
        review1.setRating(5);

        Customer customer1 = new Customer();
        customer1.setUserName("Ajay M.");
        review1.setCustomer(customer1);

        review1.setVerifiedPurchase(true);
        review1.setReviewDescription("I am rating this product since i am still using this brand from the very beginning of FishOil. But we have serious trust issues with the seller since the sealing n all seems dodgy n even the Expiration date. Hopefully we are not being served Poison as suplement. We need clear answer why the Sticker is being opened but not The Cap? if that is only my case i deserve answer or if not I am rating it down forever. let me be informed");

        List<String> reviewImages = new ArrayList<>();
        reviewImages.add("https://www.daraz.com.np/products/natures-care-australia-fish-oil-omega-3-1000mg-200-capsules-i106227678-s1027997085.html?spm=a2a0e.searchlist.list.1.38a54fd93U0hM5&search=1");
        reviewImages.add("https://www.daraz.com.np/products/natures-care-australia-fish-oil-omega-3-1000mg-200-capsules-i106227678-s1027997085.html?spm=a2a0e.searchlist.list.1.38a54fd93U0hM5&search=1");

        review1.setImages(reviewImages);

        review1.setReviewDate( new Date("2011-11-12"));

        review1.setResponseFromStore("Namaste, Thank you for using our products since the very beginning, we really appreciate it. We ensure you that the product is not dodgy and is of proper expiry date also please feel free to contact us directly as well. Regarding the seals coming off easily while opening the lid is because of the tightness of the lid, the vacuum normally pushes it towards the lid when air is released, causing the seal to get stuck on the lid after opening it for the first time. We sincerely apologize for causing this confusion. Thank you for your patience");

        review1.setResponseDate( new Date("2011-11-12"));

        fishOil.setRatings(reviews);

        Specification specification = new Specification();
        specification.setBrand("Nature's Care");
        specification.setFlavour("Not Specified");
        specification.setSku("106227678_NP-1027997085");
        specification.setInsidebox("Nature's Care Australia Fish Oil, Omega 3, 1000mg, 200 Capsules");

        fishOil.setSpecification(specification);




    }
}
