package io.septimalmind.idealingua.idealinguaintellij.psi.stubs;

/**
 * Holder for IdeaLingua stub element types.
 * This class is registered in plugin.xml as stubElementTypeHolder.
 *
 * IMPORTANT: Must be a Java class with static final fields for IntelliJ's
 * stubElementTypeHolder mechanism to work correctly.
 */
public interface IdealinguaStubElementTypes {
    IdealinguaClassNameElementType CLASS_NAME = new IdealinguaClassNameElementType();

    static IdealinguaClassNameElementType getClassNameType(String name) {
        return CLASS_NAME;
    }
}
