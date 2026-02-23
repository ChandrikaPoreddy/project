package project1;
import javax.swing.*;
import java.io.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
/* ===================== MAIN APP ===================== */
public class Ecommerce1 {

    static Cart cart = new Cart();

    public static void main(String[] args) {
        Category[] categories = buildCatalog();
        new MainFrame(categories);
    }

    /* ===================== DATA ===================== */
    static Category[] buildCatalog() {
    	Category electronics = new Category("Electronics", new SubCategory[]{

    		    new SubCategory("Mobiles", new Product[]{
    		        new Product("Samsung Galaxy A14","6.6 inch Display, 4GB RAM, 64GB Storage, 5000mAh Battery",13999),
    		        new Product("Redmi Note 12","6.67 inch AMOLED, 6GB RAM, 128GB Storage, 5000mAh Battery",15999),
    		        new Product("Realme Narzo 60","5G Support, 8GB RAM, 128GB Storage, 64MP Camera",17999),
    		        new Product("iPhone SE","A15 Bionic Chip, 64GB Storage, iOS, Retina Display",42999),
    		        new Product("OnePlus Nord CE","Snapdragon Processor, 6GB RAM, 5G, 4500mAh Battery",24999),
    		        new Product("Vivo Y20","6.51 inch Display, 4GB RAM, 5000mAh Battery",12499),
    		        new Product("Oppo A17","HD+ Display, 4GB RAM, 64GB Storage, 5000mAh Battery",11999),
    		        new Product("Motorola G32","90Hz Display, Snapdragon Processor, 5000mAh Battery",14999),
    		        new Product("Lava Blaze","Glass Back, 4GB RAM, 128GB Storage",9999),
    		        new Product("Infinix Smart 7","Entry Level Smartphone, 3GB RAM, 5000mAh Battery",7999)
    		    }),

    		    new SubCategory("Laptops", new Product[]{
    		        new Product("HP Pavilion","Intel i5, 8GB RAM, 512GB SSD, 15.6 inch",58999),
    		        new Product("Dell Inspiron","Intel i5, 16GB RAM, 512GB SSD",64999),
    		        new Product("Lenovo IdeaPad","Ryzen 5, 8GB RAM, 512GB SSD",56999),
    		        new Product("Asus VivoBook","Intel i3, 8GB RAM, 256GB SSD",45999),
    		        new Product("Acer Aspire","Intel i5, 8GB RAM, 1TB HDD",52999),
    		        new Product("MacBook Air","M1 Chip, 8GB RAM, 256GB SSD",89999),
    		        new Product("MSI Modern","Intel i7, 16GB RAM, 512GB SSD",74999),
    		        new Product("Samsung Galaxy Book","Intel i5, AMOLED Display",69999),
    		        new Product("Honor MagicBook","Ryzen 5, 8GB RAM",54999),
    		        new Product("Realme Book","Intel i5, Slim Metal Body",57999)
    		    }),

    		    new SubCategory("Audio", new Product[]{
    		        new Product("Boat Rockerz","Bluetooth, 40mm Drivers",1999),
    		        new Product("JBL Earbuds","True Wireless, Deep Bass",3999),
    		        new Product("Sony Speaker","Portable Bluetooth Speaker",6999),
    		        new Product("Noise Buds","ENC, Fast Charging",2499),
    		        new Product("Bose SoundLink","Premium Sound, Wireless",12999),
    		        new Product("Skullcandy Crusher","Extra Bass, Wireless",8999),
    		        new Product("Realme Buds","AI Noise Cancellation",3499),
    		        new Product("Apple AirPods","Spatial Audio, Wireless",24999),
    		        new Product("Zebronics Headset","Gaming Headset",1599),
    		        new Product("Philips Soundbar","2.1 Channel Sound",9999)
    		    }),

    		    new SubCategory("Tablets", new Product[]{
    		        new Product("Apple iPad","10.2 inch, A13 Chip, 64GB",32999),
    		        new Product("Samsung Galaxy Tab","AMOLED Display, 128GB",45999),
    		        new Product("Lenovo Tab M10","10 inch, 4GB RAM",17999),
    		        new Product("Realme Pad","Slim Design, 7100mAh",15999),
    		        new Product("Xiaomi Pad","Snapdragon Processor",26999),
    		        new Product("Nokia T10","8 inch, Android",14999),
    		        new Product("Asus ZenPad","Compact Tablet",13999),
    		        new Product("Huawei MatePad","High Performance Tablet",29999),
    		        new Product("Surface Go","Windows Tablet",52999),
    		        new Product("Lava Tablet","Budget Android Tablet",11999)
    		    })

    		});


    	Category fashion = new Category("Fashion", new SubCategory[]{

    		    new SubCategory("Sarees", new Product[]{
    		        new Product("Cotton Saree","Daily Wear",2999),
    		        new Product("Silk Saree","Wedding Wear",8999),
    		        new Product("Banarasi Saree","Traditional Design",12999),
    		        new Product("Kanjeevaram","Pure Silk",15999),
    		        new Product("Chiffon Saree","Light Weight",3499),
    		        new Product("Georgette","Party Wear",3999),
    		        new Product("Linen Saree","Soft Fabric",4999),
    		        new Product("Designer Saree","Modern Look",6999),
    		        new Product("Printed Saree","Casual Wear",2499),
    		        new Product("Party Saree","Premium Style",7999)
    		    }),

    		    new SubCategory("Jewellery", new Product[]{
    		        new Product("Gold Necklace","Plated Jewellery",4999),
    		        new Product("Silver Earrings","Oxidized",1999),
    		        new Product("Diamond Ring","Stone Studded",8999),
    		        new Product("Bangles","Set of 6",2999),
    		        new Product("Anklet","Traditional Wear",1499),
    		        new Product("Mangalsutra","Black Beads",3499),
    		        new Product("Pearl Necklace","Elegant Look",5999),
    		        new Product("Nose Pin","Small Size",999),
    		        new Product("Bracelet","Fashion Wear",1299),
    		        new Product("Stud Earrings","Daily Wear",1799)
    		    }),

    		    new SubCategory("Bags", new Product[]{
    		        new Product("Handbag","Leather Finish",2499),
    		        new Product("Backpack","Laptop Support",1999),
    		        new Product("Sling Bag","Casual Wear",1499),
    		        new Product("Travel Bag","Large Capacity",2999),
    		        new Product("Laptop Bag","Water Resistant",2499),
    		        new Product("School Bag","Kids Use",1799),
    		        new Product("Tote Bag","Shopping Bag",1299),
    		        new Product("Gym Bag","Sports Use",1999),
    		        new Product("Messenger Bag","Office Use",2299),
    		        new Product("Wallet","Leather Wallet",999)
    		    }),

    		    new SubCategory("Footwear", new Product[]{
    		        new Product("Sports Shoes","Running Shoes",2999),
    		        new Product("Casual Shoes","Daily Wear",2499),
    		        new Product("Formal Shoes","Office Wear",3499),
    		        new Product("Sandals","Comfort Wear",1999),
    		        new Product("Slippers","Home Use",999),
    		        new Product("Heels","Party Wear",2999),
    		        new Product("Flats","Casual Wear",1799),
    		        new Product("Loafers","Slip On",2599),
    		        new Product("Boots","Winter Wear",3999),
    		        new Product("Flip Flops","Beach Wear",799)
    		    })

    		});


        Category homeDecor = new Category("Home Decor", new SubCategory[]{

        	    new SubCategory("Bedsheets", new Product[]{
        	        new Product("Cotton Bedsheet","Soft Cotton, Double Bed",1499),
        	        new Product("Floral Bedsheet","Printed Design",1299),
        	        new Product("King Bedsheet","Large Size",1799),
        	        new Product("Satin Bedsheet","Smooth Finish",1999),
        	        new Product("Polyester Bedsheet","Easy Wash",999),
        	        new Product("Kids Bedsheet","Cartoon Print",1199),
        	        new Product("White Bedsheet","Hotel Style",899),
        	        new Product("Designer Bedsheet","Premium Look",2499),
        	        new Product("Checkered Bedsheet","Classic Pattern",1399),
        	        new Product("Waterproof Bedsheet","Mattress Protection",1599)
        	    }),

        	    new SubCategory("Cookware", new Product[]{
        	        new Product("Non Stick Pan","Scratch Resistant",1299),
        	        new Product("Pressure Cooker","5 Litre, Aluminium",1999),
        	        new Product("Kadai","Non Stick Coating",1499),
        	        new Product("Tawa","Flat Non Stick",999),
        	        new Product("Sauce Pan","Steel Material",899),
        	        new Product("Induction Set","Induction Friendly",2999),
        	        new Product("Steel Set","10 Pieces",3499),
        	        new Product("Fry Pan","Deep Fry",1199),
        	        new Product("Cast Iron Pan","Heavy Duty",2499),
        	        new Product("Cooking Pot","Large Capacity",1599)
        	    }),

        	    new SubCategory("Decor", new Product[]{
        	        new Product("Wall Clock","Silent Movement",1299),
        	        new Product("Photo Frame","Wooden Finish",799),
        	        new Product("Artificial Plant","Indoor Decor",999),
        	        new Product("Table Lamp","LED Light",1499),
        	        new Product("Mirror","Decorative Wall Mirror",2499),
        	        new Product("Wall Stickers","Easy Paste",599),
        	        new Product("Flower Vase","Ceramic",899),
        	        new Product("Showpiece","Antique Design",1799),
        	        new Product("Lantern","Hanging Decor",1299),
        	        new Product("Candle Holder","Metal Finish",699)
        	    }),

        	    new SubCategory("Mattresses", new Product[]{
        	        new Product("Foam Mattress","Soft Comfort",6999),
        	        new Product("Memory Foam","Body Support",12999),
        	        new Product("Spring Mattress","High Bounce",9999),
        	        new Product("Orthopedic","Back Support",14999),
        	        new Product("Single Mattress","Compact Size",4999),
        	        new Product("Double Mattress","Couple Use",8999),
        	        new Product("Queen Mattress","Medium Firm",11999),
        	        new Product("King Mattress","Large Size",15999),
        	        new Product("Foldable Mattress","Portable",6999),
        	        new Product("Waterproof Mattress","Spill Proof",7999)
        	    })

        	});


        Category groceries = new Category("Groceries", new SubCategory[]{

        	    new SubCategory("Chocolates", new Product[]{
        	        new Product("Dairy Milk","Milk Chocolate",100),
        	        new Product("KitKat","Wafer Chocolate",80),
        	        new Product("Five Star","Caramel Chocolate",50),
        	        new Product("Perk","Crunchy Wafer",45),
        	        new Product("Snickers","Nut Chocolate",90),
        	        new Product("Ferrero Rocher","Premium Chocolate",599),
        	        new Product("Munch","Crispy Wafer",40),
        	        new Product("Toblerone","Swiss Chocolate",499),
        	        new Product("Milky Bar","White Chocolate",60),
        	        new Product("Galaxy","Smooth Chocolate",120)
        	    }),

        	    new SubCategory("Breakfast", new Product[]{
        	        new Product("Cornflakes","Healthy Breakfast",299),
        	        new Product("Oats","High Fiber",249),
        	        new Product("Muesli","Nut Mix",399),
        	        new Product("Bread","Whole Wheat",60),
        	        new Product("Butter","Salted Butter",120),
        	        new Product("Jam","Fruit Jam",140),
        	        new Product("Pancake Mix","Easy Cook",199),
        	        new Product("Poha","Instant Poha",99),
        	        new Product("Idli Mix","Ready Mix",149),
        	        new Product("Dosa Batter","Fresh Batter",129)
        	    }),

        	    new SubCategory("Essentials", new Product[]{
        	        new Product("Rice","Premium Quality",999),
        	        new Product("Wheat Flour","Fine Quality",499),
        	        new Product("Sugar","Refined Sugar",199),
        	        new Product("Salt","Iodized Salt",99),
        	        new Product("Cooking Oil","Refined Oil",699),
        	        new Product("Toor Dal","Protein Rich",349),
        	        new Product("Chana Dal","Split Dal",299),
        	        new Product("Tea Powder","Strong Tea",399),
        	        new Product("Coffee Powder","Aromatic Coffee",449),
        	        new Product("Spices Pack","Mixed Spices",299)
        	    }),

        	    new SubCategory("Bodycare Essentials", new Product[]{
        	        new Product("Soap","Moisturizing",60),
        	        new Product("Shampoo","Anti Dandruff",249),
        	        new Product("Conditioner","Smooth Hair",199),
        	        new Product("Body Lotion","Skin Care",299),
        	        new Product("Face Wash","Oil Control",199),
        	        new Product("Toothpaste","Germ Protection",120),
        	        new Product("Toothbrush","Soft Bristles",80),
        	        new Product("Hair Oil","Nourishing Oil",180),
        	        new Product("Hand Wash","Liquid Soap",99),
        	        new Product("Deodorant","Long Lasting",199)
        	    })

        	});


        Category furniture = new Category("Furniture", new SubCategory[]{

        	    new SubCategory("Beds", new Product[]{
        	        new Product("Single Bed","Wooden Frame",14999),
        	        new Product("Double Bed","Strong Build",19999),
        	        new Product("King Bed","Large Size",29999),
        	        new Product("Queen Bed","Medium Size",25999),
        	        new Product("Wooden Bed","Teak Wood",27999),
        	        new Product("Storage Bed","With Storage",32999),
        	        new Product("Metal Bed","Iron Frame",17999),
        	        new Product("Upholstered Bed","Fabric Finish",34999),
        	        new Product("Folding Bed","Portable",12999),
        	        new Product("Bunk Bed","Kids Use",24999)
        	    }),

        	    new SubCategory("Office Chairs", new Product[]{
        	        new Product("Executive Chair","Leather Finish",8999),
        	        new Product("Computer Chair","Mesh Back",5999),
        	        new Product("Revolving Chair","360 Rotation",6999),
        	        new Product("Ergonomic Chair","Back Support",9999),
        	        new Product("Mesh Chair","Breathable",5499),
        	        new Product("Leather Chair","Premium Look",10999),
        	        new Product("Adjustable Chair","Height Adjust",7499),
        	        new Product("Visitor Chair","Office Use",3499),
        	        new Product("Study Chair","Student Use",3999),
        	        new Product("High Back Chair","Neck Support",11999)
        	    }),

        	    new SubCategory("Dining Sets", new Product[]{
        	        new Product("2 Seater","Compact Dining",14999),
        	        new Product("4 Seater","Family Use",24999),
        	        new Product("6 Seater","Large Family",34999),
        	        new Product("Wooden Set","Solid Wood",39999),
        	        new Product("Glass Set","Modern Look",29999),
        	        new Product("Foldable Set","Space Saving",19999),
        	        new Product("Compact Set","Small Homes",17999),
        	        new Product("Modern Set","Stylish Design",32999),
        	        new Product("Traditional Set","Classic Look",28999),
        	        new Product("Marble Set","Premium Finish",44999)
        	    }),

        	    new SubCategory("Sofas", new Product[]{
        	        new Product("Single Sofa","Compact",9999),
        	        new Product("2 Seater","Small Family",15999),
        	        new Product("3 Seater","Living Room",21999),
        	        new Product("L Shape","Corner Sofa",34999),
        	        new Product("Recliner","Relax Sofa",39999),
        	        new Product("Fabric Sofa","Soft Fabric",19999),
        	        new Product("Leather Sofa","Premium Leather",44999),
        	        new Product("Sofa Cum Bed","Multi Purpose",29999),
        	        new Product("Sectional Sofa","Large Seating",36999),
        	        new Product("Wooden Sofa","Traditional",25999)
        	    })

        	});

        return new Category[]{electronics, fashion, homeDecor, groceries, furniture};
    }


    /* ===================== UI ===================== */
    static class MainFrame extends JFrame {

        public MainFrame(Category[] categories) {
            setTitle("E-Commerce App");
            setSize(400, 350);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            DefaultListModel<String> model = new DefaultListModel<>();
            for (Category c : categories) model.addElement(c.name);

            JList<String> list = new JList<>(model);
            JScrollPane pane = new JScrollPane(list);

            JButton checkoutBtn = new JButton("Checkout 🛒");

            checkoutBtn.addActionListener(e -> {
                if (cart.count == 0) {
                    JOptionPane.showMessageDialog(this, "Cart is empty!");
                } else {
                    new CartFrame(cart);
                }
            });

            add(pane, BorderLayout.CENTER);
            add(checkoutBtn, BorderLayout.SOUTH);

            list.addListSelectionListener(e -> {
                if (!e.getValueIsAdjusting()) {
                    int index = list.getSelectedIndex();
                    new SubCategoryFrame(categories[index]);
                }
            });

            setVisible(true);
        }
    }


static class SubCategoryFrame extends JFrame {

        public SubCategoryFrame(Category category) {
            setTitle(category.name);
            setSize(300, 200);
            setLocationRelativeTo(null);

            DefaultListModel<String> model = new DefaultListModel<>();
            for (SubCategory sc : category.subCategories)
                model.addElement(sc.name);

            JList<String> list = new JList<>(model);
            add(new JScrollPane(list));

            list.addListSelectionListener(e -> {
                if (!e.getValueIsAdjusting()) {
                    new ProductFrame(category.subCategories[list.getSelectedIndex()]);
                }
            });

            setVisible(true);
        }
    }

static   class ProductFrame extends JFrame {

        JTable table;

        public ProductFrame(SubCategory sc) {
            setTitle(sc.name);
            setSize(500, 300);
            setLocationRelativeTo(null);

            String[] cols = {"Name", "Brand", "Price"};
            DefaultTableModel model = new DefaultTableModel(cols, 0);

            for (Product p : sc.products)
                model.addRow(new Object[]{p.name, p.brand, p.price});

            table = new JTable(model);
            add(new JScrollPane(table));

            JButton addCart = new JButton("Add to Cart");
            JButton buyNow = new JButton("Buy Now");

            addCart.addActionListener(e -> {
                int row = table.getSelectedRow();
                if (row == -1) {
                    JOptionPane.showMessageDialog(this, "Select product");
                    return;
                }
                cart.add(sc.products[row]);
                JOptionPane.showMessageDialog(this, "Added to Cart");
            });

            buyNow.addActionListener(e -> {
                int row = table.getSelectedRow();
                if (row == -1) {
                    JOptionPane.showMessageDialog(this, "Select product");
                    return;
                }
                Cart temp = new Cart();
                temp.add(sc.products[row]);
                new PaymentFrame(temp);
            });

            JPanel panel = new JPanel();
            panel.add(addCart);
            panel.add(buyNow);
            add(panel, BorderLayout.SOUTH);

            setVisible(true);
        }
    }
static  class CartFrame extends JFrame {

        public CartFrame(Cart cart) {
            setTitle("Checkout");
            setSize(500, 300);
            setLocationRelativeTo(null);

            String[] cols = {"Product", "Price"};
            DefaultTableModel model = new DefaultTableModel(cols, 0);

            for (int i = 0; i < cart.count; i++) {
                model.addRow(new Object[]{
                        cart.items[i].name,
                        cart.items[i].price
                });
            }

            JTable table = new JTable(model);
            add(new JScrollPane(table));

            JButton payBtn = new JButton("Proceed to Payment");

            payBtn.addActionListener(e -> {
                new PaymentFrame(cart);
                dispose();
            });

            add(payBtn, BorderLayout.SOUTH);
            setVisible(true);
        }
    }



    /* ===================== PAYMENT & RECEIPT ===================== */
static class PaymentFrame extends JFrame {

    public PaymentFrame(Cart cart) {
        setTitle("Payment");
        setSize(300, 200);
        setLocationRelativeTo(null);

        String[] options = {"UPI", "Card"};
        int choice = JOptionPane.showOptionDialog(
                this,
                "Choose Payment Method",
                "Payment",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]
        );

        if (choice == 0) {
            // UPI PAYMENT
            String upiId = JOptionPane.showInputDialog(
                    this,
                    "Enter UPI ID (example: name@bank)"
            );

            if (upiId == null || upiId.trim().isEmpty() || !upiId.contains("@")) {
                JOptionPane.showMessageDialog(this, "Invalid UPI ID!");
                return;
            }

            JOptionPane.showMessageDialog(this, "UPI Payment Successful!");

        } else if (choice == 1) {
            // CARD PAYMENT
            JTextField nameField = new JTextField();
            JTextField cardField = new JTextField();
            JTextField cvvField = new JTextField();

            Object[] message = {
                    "Cardholder Name:", nameField,
                    "Card Number:", cardField,
                    "CVV Number:", cardField

            };

            int result = JOptionPane.showConfirmDialog(
                    this,
                    message,
                    "Card Payment",
                    JOptionPane.OK_CANCEL_OPTION
            );

            if (result != JOptionPane.OK_OPTION) return;

            String name = nameField.getText();
            String cardNo = cardField.getText();
            String cvvNo = cvvField.getText();

            if (name.trim().isEmpty() || cardNo.length() != 16 || cardNo.length() != 3) {
                JOptionPane.showMessageDialog(this, "Invalid card details!");
                return;
            }

            JOptionPane.showMessageDialog(this, "Card Payment Successful!");
        } else {
            return; // user closed dialog
        }

        new ReceiptFrame(cart);
        dispose();
    	}
	}


static   class ReceiptFrame extends JFrame {

        public ReceiptFrame(Cart cart) {
            setTitle("Receipt");
            setSize(400, 400);
            setLocationRelativeTo(null);

            JTextArea area = new JTextArea();
            area.setEditable(false);

            double subtotal = cart.getTotal();
            double gst = subtotal * 0.18;
            double total = subtotal + gst;

            area.append("🧾 RECEIPT\n\n");
            for (int i = 0; i < cart.count; i++)
                area.append(cart.items[i].name + " - ₹" + cart.items[i].price + "\n");

            area.append("\nSubtotal: ₹" + subtotal);
            area.append("\nGST (18%): ₹" + gst);
            area.append("\nTotal: ₹" + total);

            add(new JScrollPane(area));
            setVisible(true);
        }
    }
    
    /* ===================== MODELS ===================== */
static  class Product {
        String name, brand;
        double price;

        Product(String n, String b, double p) {
            name = n;
            brand = b;
            price = p;
        }
    }

static class SubCategory {
        String name;
        Product[] products;

        SubCategory(String n, Product[] p) {
            name = n;
            products = p;
        }
    }

static class Category {
        String name;
        SubCategory[] subCategories;

        Category(String n, SubCategory[] s) {
            name = n;
            subCategories = s;
        }
    }

static class Cart {
        Product[] items = new Product[50];
        int count = 0;

        void add(Product p) {
            items[count++] = p;
        }

        double getTotal() {
            double sum = 0;
            for (int i = 0; i < count; i++)
                sum += items[i].price;
            return sum;
        }
    }

}
