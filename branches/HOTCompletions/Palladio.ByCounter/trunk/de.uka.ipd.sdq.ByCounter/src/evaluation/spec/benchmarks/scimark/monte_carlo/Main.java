/*
 * Copyright (c) 2008 Standard Performance Evaluation Corporation (SPEC)
 *               All rights reserved.
 *
 * This source code is provided as is, without any express or implied warranty.
 */

package evaluation.spec.benchmarks.scimark.monte_carlo;

import evaluation.spec.benchmarks.scimark.utils.kernel;
import evaluation.spec.harness.SpecJVMBenchmarkBase;
import evaluation.spec.harness.results.BenchmarkResult;

public class Main extends SpecJVMBenchmarkBase {
    
    /** Run this in multi mode, next to each other. */
    public static String testType() {
        return MULTI;
    }
    
    static void runBenchmark() {
        // Loop a few times, to create some more work in each ops.
        for (int i = kernel.MC_LOOPS; i > 0; i --) {
            MonteCarlo.main();
        }
    }
    
    public static void Main() {
        runBenchmark();
    }
    
    public void harnessMain() {
        runBenchmark();
    }
    
    public Main(BenchmarkResult bmResult, int threadId) {
        super(bmResult, threadId);
    }

    public static void main(String[] args) throws Exception {
        runSimple( Main.class, args );
    }
}