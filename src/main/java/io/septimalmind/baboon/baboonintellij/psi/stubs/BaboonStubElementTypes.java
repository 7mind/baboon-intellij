package io.septimalmind.baboon.baboonintellij.psi.stubs;

/**
 * Holder for Baboon stub element types.
 * This class is registered in plugin.xml as stubElementTypeHolder.
 *
 * IMPORTANT: Must be a Java class with static final fields for IntelliJ's
 * stubElementTypeHolder mechanism to work correctly.
 */
public interface BaboonStubElementTypes {
    BaboonClassNameElementType CLASS_NAME = new BaboonClassNameElementType();

    static BaboonClassNameElementType getClassNameType(String name) {
        return CLASS_NAME;
    }
}
