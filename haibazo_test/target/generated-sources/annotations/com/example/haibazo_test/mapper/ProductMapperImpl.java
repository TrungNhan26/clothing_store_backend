package com.example.haibazo_test.mapper;

import com.example.haibazo_test.dto.CategoryDTO;
import com.example.haibazo_test.dto.ColorDTO;
import com.example.haibazo_test.dto.ProductDTO;
import com.example.haibazo_test.dto.ReviewDTO;
import com.example.haibazo_test.dto.SizeDTO;
import com.example.haibazo_test.dto.StyleDTO;
import com.example.haibazo_test.model.Category;
import com.example.haibazo_test.model.Color;
import com.example.haibazo_test.model.Product;
import com.example.haibazo_test.model.Review;
import com.example.haibazo_test.model.Size;
import com.example.haibazo_test.model.Style;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-01T02:15:45+0700",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.40.0.v20240919-1711, environment: Java 17.0.12 (Eclipse Adoptium)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDTO toProductsDTO(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDTO productDTO = new ProductDTO();

        productDTO.setCategory( categoryToCategoryDTO( product.getCategory() ) );
        productDTO.setColors( colorSetToColorDTOList( product.getColors() ) );
        productDTO.setSizes( sizeSetToSizeDTOList( product.getSizes() ) );
        productDTO.setStyles( styleSetToStyleDTOList( product.getStyles() ) );
        productDTO.setName( product.getName() );
        productDTO.setPrice( product.getPrice() );
        productDTO.setProductId( product.getProductId() );
        productDTO.setReviews( reviewSetToReviewDTOList( product.getReviews() ) );

        return productDTO;
    }

    @Override
    public Product toProductEntity(ProductDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Product product = new Product();

        product.setCategory( categoryDTOToCategory( dto.getCategory() ) );
        product.setColors( colorDTOListToColorSet( dto.getColors() ) );
        product.setName( dto.getName() );
        product.setPrice( dto.getPrice() );
        product.setProductId( dto.getProductId() );
        product.setReviews( reviewDTOListToReviewSet( dto.getReviews() ) );
        product.setSizes( sizeDTOListToSizeSet( dto.getSizes() ) );
        product.setStyles( styleDTOListToStyleSet( dto.getStyles() ) );

        return product;
    }

    protected CategoryDTO categoryToCategoryDTO(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryDTO categoryDTO = new CategoryDTO();

        categoryDTO.setCategoryId( category.getCategoryId() );
        categoryDTO.setCategoryType( category.getCategoryType() );
        categoryDTO.setDescription( category.getDescription() );

        return categoryDTO;
    }

    protected ColorDTO colorToColorDTO(Color color) {
        if ( color == null ) {
            return null;
        }

        ColorDTO colorDTO = new ColorDTO();

        colorDTO.setColorId( color.getColorId() );
        colorDTO.setColorType( color.getColorType() );

        return colorDTO;
    }

    protected List<ColorDTO> colorSetToColorDTOList(Set<Color> set) {
        if ( set == null ) {
            return null;
        }

        List<ColorDTO> list = new ArrayList<ColorDTO>( set.size() );
        for ( Color color : set ) {
            list.add( colorToColorDTO( color ) );
        }

        return list;
    }

    protected SizeDTO sizeToSizeDTO(Size size) {
        if ( size == null ) {
            return null;
        }

        SizeDTO sizeDTO = new SizeDTO();

        sizeDTO.setSizeId( size.getSizeId() );
        sizeDTO.setSizeType( size.getSizeType() );

        return sizeDTO;
    }

    protected List<SizeDTO> sizeSetToSizeDTOList(Set<Size> set) {
        if ( set == null ) {
            return null;
        }

        List<SizeDTO> list = new ArrayList<SizeDTO>( set.size() );
        for ( Size size : set ) {
            list.add( sizeToSizeDTO( size ) );
        }

        return list;
    }

    protected StyleDTO styleToStyleDTO(Style style) {
        if ( style == null ) {
            return null;
        }

        StyleDTO styleDTO = new StyleDTO();

        styleDTO.setDescription( style.getDescription() );
        styleDTO.setStyleId( style.getStyleId() );
        styleDTO.setStyleType( style.getStyleType() );

        return styleDTO;
    }

    protected List<StyleDTO> styleSetToStyleDTOList(Set<Style> set) {
        if ( set == null ) {
            return null;
        }

        List<StyleDTO> list = new ArrayList<StyleDTO>( set.size() );
        for ( Style style : set ) {
            list.add( styleToStyleDTO( style ) );
        }

        return list;
    }

    protected ReviewDTO reviewToReviewDTO(Review review) {
        if ( review == null ) {
            return null;
        }

        ReviewDTO reviewDTO = new ReviewDTO();

        reviewDTO.setComment( review.getComment() );
        reviewDTO.setCreatedAt( review.getCreatedAt() );
        reviewDTO.setRating( review.getRating() );
        reviewDTO.setReviewId( review.getReviewId() );

        return reviewDTO;
    }

    protected List<ReviewDTO> reviewSetToReviewDTOList(Set<Review> set) {
        if ( set == null ) {
            return null;
        }

        List<ReviewDTO> list = new ArrayList<ReviewDTO>( set.size() );
        for ( Review review : set ) {
            list.add( reviewToReviewDTO( review ) );
        }

        return list;
    }

    protected Category categoryDTOToCategory(CategoryDTO categoryDTO) {
        if ( categoryDTO == null ) {
            return null;
        }

        Category category = new Category();

        category.setCategoryId( categoryDTO.getCategoryId() );
        category.setCategoryType( categoryDTO.getCategoryType() );
        category.setDescription( categoryDTO.getDescription() );

        return category;
    }

    protected Color colorDTOToColor(ColorDTO colorDTO) {
        if ( colorDTO == null ) {
            return null;
        }

        Color color = new Color();

        color.setColorId( colorDTO.getColorId() );
        color.setColorType( colorDTO.getColorType() );

        return color;
    }

    protected Set<Color> colorDTOListToColorSet(List<ColorDTO> list) {
        if ( list == null ) {
            return null;
        }

        Set<Color> set = new LinkedHashSet<Color>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( ColorDTO colorDTO : list ) {
            set.add( colorDTOToColor( colorDTO ) );
        }

        return set;
    }

    protected Review reviewDTOToReview(ReviewDTO reviewDTO) {
        if ( reviewDTO == null ) {
            return null;
        }

        Review review = new Review();

        review.setComment( reviewDTO.getComment() );
        review.setCreatedAt( reviewDTO.getCreatedAt() );
        review.setRating( reviewDTO.getRating() );
        review.setReviewId( reviewDTO.getReviewId() );

        return review;
    }

    protected Set<Review> reviewDTOListToReviewSet(List<ReviewDTO> list) {
        if ( list == null ) {
            return null;
        }

        Set<Review> set = new LinkedHashSet<Review>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( ReviewDTO reviewDTO : list ) {
            set.add( reviewDTOToReview( reviewDTO ) );
        }

        return set;
    }

    protected Size sizeDTOToSize(SizeDTO sizeDTO) {
        if ( sizeDTO == null ) {
            return null;
        }

        Size size = new Size();

        size.setSizeId( sizeDTO.getSizeId() );
        size.setSizeType( sizeDTO.getSizeType() );

        return size;
    }

    protected Set<Size> sizeDTOListToSizeSet(List<SizeDTO> list) {
        if ( list == null ) {
            return null;
        }

        Set<Size> set = new LinkedHashSet<Size>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( SizeDTO sizeDTO : list ) {
            set.add( sizeDTOToSize( sizeDTO ) );
        }

        return set;
    }

    protected Style styleDTOToStyle(StyleDTO styleDTO) {
        if ( styleDTO == null ) {
            return null;
        }

        Style style = new Style();

        style.setDescription( styleDTO.getDescription() );
        style.setStyleId( styleDTO.getStyleId() );
        style.setStyleType( styleDTO.getStyleType() );

        return style;
    }

    protected Set<Style> styleDTOListToStyleSet(List<StyleDTO> list) {
        if ( list == null ) {
            return null;
        }

        Set<Style> set = new LinkedHashSet<Style>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( StyleDTO styleDTO : list ) {
            set.add( styleDTOToStyle( styleDTO ) );
        }

        return set;
    }
}
