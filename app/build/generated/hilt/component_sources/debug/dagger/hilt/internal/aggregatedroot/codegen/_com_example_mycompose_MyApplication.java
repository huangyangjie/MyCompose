package dagger.hilt.internal.aggregatedroot.codegen;

import dagger.hilt.android.HiltAndroidApp;
import dagger.hilt.internal.aggregatedroot.AggregatedRoot;
import javax.annotation.processing.Generated;

/**
 * This class should only be referenced by generated code! This class aggregates information across multiple compilations.
 */
@AggregatedRoot(
    root = "com.example.mycompose.MyApplication",
    rootPackage = "com.example.mycompose",
    originatingRoot = "com.example.mycompose.MyApplication",
    originatingRootPackage = "com.example.mycompose",
    rootAnnotation = HiltAndroidApp.class,
    rootComponentPackage = "dagger.hilt.components",
    rootSimpleNames = "MyApplication",
    originatingRootSimpleNames = "MyApplication",
    rootComponentSimpleNames = "SingletonComponent"
)
@Generated("dagger.hilt.processor.internal.root.AggregatedRootGenerator")
public class _com_example_mycompose_MyApplication {
}
