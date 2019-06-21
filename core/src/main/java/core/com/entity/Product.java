/*
 *
 *
 * Copyright (c) 2018, CGI.
 */
package core.com.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author T.Menad
 */
public class Product {
    private String ingredients_text_with_allergens_fr;
    private int ingredients_that_may_be_from_palm_oil_n;
    private int additives_prev_n;
    private List<String> checkers;
    private int new_additives_n;
    private int scans_n;
    private String countries;
    private String traces;
    private String brands;
    private String lc;
    private String image_ingredients_thumb_url;
    private List<String>ingredients_n_tags;
    private int unique_scans_n;
    private Map<String,Integer> languages;
    private String product_name;
    ArrayList < Object > pnns_groups_1_tags = new ArrayList < Object > ();
    ArrayList < Object > ingredients_that_may_be_from_palm_oil_tags = new ArrayList < Object > ();
    ArrayList < Object > nova_groups_tags = new ArrayList < Object > ();
    ArrayList < Object > nutrition_grades_tags = new ArrayList < Object > ();
    private String update_key;
    ArrayList < Object > vitamins_prev_tags = new ArrayList < Object > ();
    private float ingredients_from_palm_oil_n;
    ArrayList < Object > countries_hierarchy = new ArrayList < Object > ();
    private float unknown_ingredients_n;
    private String ingredients_n;
    ArrayList < Object > nucleotides_prev_tags = new ArrayList < Object > ();
    ArrayList < Object > origins_tags = new ArrayList < Object > ();
    private float complete;
    private Map<String,Integer> Nutriments;
    private String lang;
    ArrayList < Object > photographers_tags = new ArrayList < Object > ();
    private String interface_version_modified;
    private String id;
    ArrayList < Object > allergens_tags = new ArrayList < Object > ();
    private float sortkey;
    private String no_nutrition_data;
    ArrayList < Object > additives_prev_original_tags = new ArrayList < Object > ();
    ArrayList < Object > quality_tags = new ArrayList < Object > ();
    private String allergens_from_ingredients;
    private String image_ingredients_url;
    private float nutrition_score_beverage;
    ArrayList < Object > checkers_tags = new ArrayList < Object > ();
//    Images ImagesObject;
//    ArrayList < Object > labels_prev_hierarchy = new ArrayList < Object > ();
//    private float product_quantity;
//    ArrayList < Object > correctors = new ArrayList < Object > ();
//    private String product_name_fr;
//    private String _id;
//    Selected_images Selected_imagesObject;
//    private String purchase_places;
//    ArrayList < Object > additives_prev_tags = new ArrayList < Object > ();
//    private String image_thumb_url;
//    ArrayList < Object > languages_tags = new ArrayList < Object > ();
//    private String ingredients_text_with_allergens;
//    ArrayList < Object > labels_tags = new ArrayList < Object > ();
//    private String additives;
//    private String pnns_groups_2;
//    ArrayList < Object > states_hierarchy = new ArrayList < Object > ();
//    private String additives_prev;
//    Languages_codes Languages_codesObject;
//    private String quantity;
//    ArrayList < Object > labels_hierarchy = new ArrayList < Object > ();
//    ArrayList < Object > nucleotides_tags = new ArrayList < Object > ();
//    private String nutrition_score_debug;
//    private String nutrition_data_per;
//    ArrayList < Object > traces_hierarchy = new ArrayList < Object > ();
//    ArrayList < Object > packaging_tags = new ArrayList < Object > ();
//    ArrayList < Object > countries_debug_tags = new ArrayList < Object > ();
//    private float last_image_t;
//    private String packaging;
//    ArrayList < Object > categories_tags = new ArrayList < Object > ();
//    ArrayList < Object > minerals_tags = new ArrayList < Object > ();
//    ArrayList < Object > pnns_groups_2_tags = new ArrayList < Object > ();
//    ArrayList < Object > emb_codes_tags = new ArrayList < Object > ();
//    ArrayList < Object > additives_tags = new ArrayList < Object > ();
//    ArrayList < Object > ingredients_hierarchy = new ArrayList < Object > ();
//    private String image_front_url;
//    ArrayList < Object > informers = new ArrayList < Object > ();
//    ArrayList < Object > unknown_nutrients_tags = new ArrayList < Object > ();
//    ArrayList < Object > last_edit_dates_tags = new ArrayList < Object > ();
//    ArrayList < Object > codes_tags = new ArrayList < Object > ();
//    private String ingredients_text_fr;
//    private String image_ingredients_small_url;
//    private String last_editor;
//    private String nova_groups;
//    private String image_front_small_url;
//    ArrayList < Object > additives_old_tags = new ArrayList < Object > ();
//    ArrayList < Object > editors = new ArrayList < Object > ();
//    ArrayList < Object > photographers = new ArrayList < Object > ();
//    private String emb_codes_20141016;
//    private float additives_old_n;
//    private String pnns_groups_1;
//    private float ingredients_from_or_that_may_be_from_palm_oil_n;
//    private String image_url;
//    ArrayList < Object > ingredients_tags = new ArrayList < Object > ();
//    private String categories;
//    private float created_t;
//    private String allergens;
//    private float last_modified_t;
//    ArrayList < Object > additives_debug_tags = new ArrayList < Object > ();
//    private String interface_version_created;
//    private String stores;
//    private String countries_lc;
//    ArrayList < Object > amino_acids_tags = new ArrayList < Object > ();
//    private String ingredients_text;
//    private String emb_codes_orig;
//    ArrayList < Object > ingredients_ids_debug = new ArrayList < Object > ();
//    private String creator;
//    private String last_modified_by;
//    private String max_imgid;
//    private float additives_n;
//    ArrayList < Object > ingredients_original_tags = new ArrayList < Object > ();
//    ArrayList < Object > informers_tags = new ArrayList < Object > ();
//    private String nova_group;
//    ArrayList < Object > vitamins_tags = new ArrayList < Object > ();
//    ArrayList < Object > languages_hierarchy = new ArrayList < Object > ();
//    ArrayList < Object > ingredients = new ArrayList < Object > ();
//    ArrayList < Object > categories_hierarchy = new ArrayList < Object > ();
//    ArrayList < Object > minerals_prev_tags = new ArrayList < Object > ();
//    ArrayList < Object > editors_tags = new ArrayList < Object > ();
//    private String generic_name;
//    private String image_front_thumb_url;
//    Nutrient_levels Nutrient_levelsObject;
//    private float completed_t;
//    ArrayList < Object > nutrient_levels_tags = new ArrayList < Object > ();
//    ArrayList < Object > brands_tags = new ArrayList < Object > ();
//    private String categories_lc;
//    ArrayList < Object > amino_acids_prev_tags = new ArrayList < Object > ();
//    ArrayList < Object > misc_tags = new ArrayList < Object > ();
//    ArrayList < Object > allergens_hierarchy = new ArrayList < Object > ();
//    ArrayList < Object > correctors_tags = new ArrayList < Object > ();
//    ArrayList < Object > cities_tags = new ArrayList < Object > ();
//    ArrayList < Object > countries_tags = new ArrayList < Object > ();
//    ArrayList < Object > traces_tags = new ArrayList < Object > ();
//    private String ingredients_text_debug;
//    private String image_small_url;
//    private String origins;
//    private String nova_group_debug;
//    private String traces_from_ingredients;
//    private String emb_codes;
//    ArrayList < Object > labels_prev_tags = new ArrayList < Object > ();
//    ArrayList < Object > _keywords = new ArrayList < Object > ();
//    ArrayList < Object > purchase_places_tags = new ArrayList < Object > ();
//    ArrayList < Object > additives_original_tags = new ArrayList < Object > ();
//    private String code;
//    ArrayList < Object > entry_dates_tags = new ArrayList < Object > ();
//    ArrayList < Object > stores_tags = new ArrayList < Object > ();
//    ArrayList < Object > ingredients_debug = new ArrayList < Object > ();
//    ArrayList < Object > ingredients_from_palm_oil_tags = new ArrayList < Object > ();
//    private String labels_lc;
//    ArrayList < Object > last_image_dates_tags = new ArrayList < Object > ();
//    ArrayList < Object > states_tags = new ArrayList < Object > ();
//    private String generic_name_fr;
//    private float rev;
//    private String labels;
//    private String states;
//    private String nutrition_data_prepared_per;

    
    
    
    
    
    
    

}
