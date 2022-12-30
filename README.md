# Product Purchase - N11 Test Otomasyon Projesi

Task
---
- https://www.n11.com. sitesi açılır.
- Ana sayfanın açıldığı kontrol edilir.
- Çerez tercihlerinden Çerezleri kabul et seçilir.
- Siteye login olunur.
- Login işlemi kontrol edilir.
- Kullanıcının N11 web sitesine gidilir ve üye olunduğu varsayılır.
- Kullanıcı, "Elektronik" kategorisine gider ve "Telefon" alt kategorisine tıklar.
- Kullanıcı, "Fiyat Artan" sıralama seçeneğini seçer ve sayfayı yeniler.
- Kullanıcı, listeden ilk ürünü seçer ve ürün sayfasına gider
- Kullanıcı, sepete ekle düğmesine tıklar ve sepet sayfasına gider. 
- Kullanıcı, sepet sayfasında ürünün adedini 2 olarak değiştirir.
- Kullanıcı, "Devam Et" düğmesine tıklar ve ödeme sayfasına gider.
- Kullanıcı, ödeme yap düğmesinin varlığını kontrol eder.


## 👨🏿‍💻 Senaryo

```cucumber
Feature: Purchase product


  Scenario Outline: Successful product purchase
    Given The user goes to the <url>
    And   I check that the home page is opened
    And   I choose Accept Cookies from the cookie preferences
    And   I login with "<email>" and "<password>"
    And   I check that successfully login
    And  The user navigates to the "<Listname>" category and clicks on the "<Product>" subcategory.
    And  The user selects the Price Ascending sort option and refreshes the page.
    And  The user selects the "<firstproduct>" from the list and goes to the product page.
    And  User clicks add to cart button and goes to cart page.
    And  The user changes the quantity of the product to 2 on the cart page.
    And  The user clicks the "Continue" button and goes to the payment page.
    Then  The user checks for the existence of the make payment button.


    Examples:
      | url                    | email               | password     | Listname   | Product | firstproduct |
      | "https://www.n11.com/" | ornekmail@gmail.com | orneksifre   | Elektronik | Telefon | 1            |
```

