/*
 * 
 * Copyright (c) 2000-2008 Standard Performance Evaluation Corporation (SPEC)
 *               All rights reserved. 
 * Copyright (c) 2000-2008 Hewlett-Packard All rights reserved.
 * Copyright (c) 1997-2008 Sun Microsystems, Inc. All rights reserved.
 * 
 * This source code is provided as is, without any express or implied warranty.
 *  
 */
package spec.validity;

import java.util.*;
import java.lang.*;

public class ExpectedResourceDigests 
    implements Iterable<String>
{ 
    HashMap<String, byte[]> hm;

    /*****
     * Generated digests
     *****/

    private final static String[] resources = {
        "check/LICENSE",
        "check/validity.check.dat",
        "compiler.compiler/validity.compiler.compiler.dat",
        "compiler.sunflow/validity.compiler.sunflow.dat",
        "compress/input/202.tar",
        "compress/input/205.tar",
        "compress/input/208.tar",
        "compress/input/209.tar",
        "compress/input/210.tar",
        "compress/input/211.tar",
        "compress/input/213x.tar",
        "compress/input/228.tar",
        "compress/input/239.tar",
        "compress/input/misc.tar",
        "compress/validity.compress.dat",
        "crypto.aes/validity.crypto.aes.dat",
        "crypto.rsa/validity.crypto.rsa.dat",
        "crypto.signverify/validity.crypto.signverify.dat",
        "crypto/fredmans21.txt",
        "crypto/random1024.dat",
        "crypto/random1048576.dat",
        "crypto/random4096.dat",
        "crypto/random65536.dat",
        "crypto/random96.dat",
        "crypto/track3.mp3",
        "derby/calls.bin",
        "derby/specs.bin",
        "derby/validity.derby.dat",
        "helloworld/validity.helloworld.dat",
        "mpegaudio/input/track0.mp3",
        "mpegaudio/input/track1.mp3",
        "mpegaudio/input/track2.mp3",
        "mpegaudio/input/track3.mp3",
        "mpegaudio/input/track4.mp3",
        "mpegaudio/input/track5.mp3",
        "mpegaudio/validity.mpegaudio.dat",
        "scimark.fft/validity.scimark.fft.dat",
        "scimark.lu/validity.scimark.lu.dat",
        "scimark.monte_carlo/validity.scimark.monte_carlo.dat",
        "scimark.sor/validity.scimark.sor.dat",
        "scimark.sparse/validity.scimark.sparse.dat",
        "serial/validity.serial.dat",
        "startup/validity.startup.dat",
        "sunflow/validity.sunflow.dat",
        "xml.transform/chess-fo/Kasparov-Karpov.tmpl",
        "xml.transform/chess-fo/Kasparov-Karpov.xml",
        "xml.transform/chess-fo/Kasparov-Karpov.xml.DOM.canon",
        "xml.transform/chess-fo/Kasparov-Karpov.xml.SAX.canon",
        "xml.transform/chess-fo/Kasparov-Karpov.xml.Stream.canon",
        "xml.transform/chess-fo/chess.xsl",
        "xml.transform/dsd/article.xml",
        "xml.transform/dsd/article.xml.DOM.canon",
        "xml.transform/dsd/article.xml.DOM.tidy.xml",
        "xml.transform/dsd/article.xml.SAX.canon",
        "xml.transform/dsd/article.xml.SAX.tidy.xml",
        "xml.transform/dsd/article.xml.Stream.canon",
        "xml.transform/dsd/article.xml.Stream.tidy.xml",
        "xml.transform/dsd/article2html.xsl",
        "xml.transform/jenitennison/index.tmpl",
        "xml.transform/jenitennison/index.xml",
        "xml.transform/jenitennison/index.xml.DOM.canon",
        "xml.transform/jenitennison/index.xml.SAX.canon",
        "xml.transform/jenitennison/index.xml.Stream.canon",
        "xml.transform/jenitennison/markme.xsl",
        "xml.transform/jenitennison/markup.xsl",
        "xml.transform/jenitennison/page.xsl",
        "xml.transform/jenitennison/text.tmpl",
        "xml.transform/jenitennison/text.xml",
        "xml.transform/jenitennison/text.xml.DOM.canon",
        "xml.transform/jenitennison/text.xml.DOM.tidy.xml",
        "xml.transform/jenitennison/text.xml.SAX.canon",
        "xml.transform/jenitennison/text.xml.SAX.tidy.xml",
        "xml.transform/jenitennison/text.xml.Stream.canon",
        "xml.transform/jenitennison/text.xml.Stream.tidy.xml",
        "xml.transform/nitf/nitf-fishing.xml",
        "xml.transform/nitf/nitf-fishing.xml.DOM.canon",
        "xml.transform/nitf/nitf-fishing.xml.DOM.tidy.xml",
        "xml.transform/nitf/nitf-fishing.xml.SAX.canon",
        "xml.transform/nitf/nitf-fishing.xml.SAX.tidy.xml",
        "xml.transform/nitf/nitf-fishing.xml.Stream.canon",
        "xml.transform/nitf/nitf-fishing.xml.Stream.tidy.xml",
        "xml.transform/nitf/nitf-stylized.xsl",
        "xml.transform/recipes/recipes.xml",
        "xml.transform/recipes/recipes.xml.DOM.canon",
        "xml.transform/recipes/recipes.xml.DOM.tidy.xml",
        "xml.transform/recipes/recipes.xml.SAX.canon",
        "xml.transform/recipes/recipes.xml.SAX.tidy.xml",
        "xml.transform/recipes/recipes.xml.Stream.canon",
        "xml.transform/recipes/recipes.xml.Stream.tidy.xml",
        "xml.transform/recipes/recipes.xsl",
        "xml.transform/renderx/chess/Kasparov-Karpov.fo",
        "xml.transform/renderx/chess/Kasparov-Karpov.ps",
        "xml.transform/renderx/chess/Kasparov-Karpov.xml",
        "xml.transform/renderx/chess/Kasparov-Karpov.xml.DOM.canon",
        "xml.transform/renderx/chess/Kasparov-Karpov.xml.SAX.canon",
        "xml.transform/renderx/chess/Kasparov-Karpov.xml.Stream.canon",
        "xml.transform/renderx/chess/chess.xsl",
        "xml.transform/renderx/chess/url.txt",
        "xml.transform/renderx/examples/balance/balance_sheet.fo",
        "xml.transform/renderx/examples/balance/balance_sheet.xml",
        "xml.transform/renderx/examples/balance/balance_sheet.xml.DOM.canon",
        "xml.transform/renderx/examples/balance/balance_sheet.xml.SAX.canon",
        "xml.transform/renderx/examples/balance/balance_sheet.xml.Stream.canon",
        "xml.transform/renderx/examples/balance/balance_sheet.xsl",
        "xml.transform/renderx/examples/meeting/meeting_minutes.fo",
        "xml.transform/renderx/examples/meeting/meeting_minutes.xml",
        "xml.transform/renderx/examples/meeting/meeting_minutes.xml.DOM.canon",
        "xml.transform/renderx/examples/meeting/meeting_minutes.xml.SAX.canon",
        "xml.transform/renderx/examples/meeting/meeting_minutes.xml.Stream.canon",
        "xml.transform/renderx/examples/meeting/meeting_minutes.xsl",
        "xml.transform/shared/REC-xml-19980210.tmpl",
        "xml.transform/shared/REC-xml-19980210.xml",
        "xml.transform/shared/REC-xml-19980210.xml.DOM.canon",
        "xml.transform/shared/REC-xml-19980210.xml.DOM.tidy.xml",
        "xml.transform/shared/REC-xml-19980210.xml.SAX.canon",
        "xml.transform/shared/REC-xml-19980210.xml.SAX.tidy.xml",
        "xml.transform/shared/REC-xml-19980210.xml.Stream.canon",
        "xml.transform/shared/REC-xml-19980210.xml.Stream.tidy.xml",
        "xml.transform/shared/spec.dtd",
        "xml.transform/shared/version.xsl",
        "xml.transform/sp.xsl/COPYING",
        "xml.transform/sp.xsl/README",
        "xml.transform/sp.xsl/index.d.xml",
        "xml.transform/sp.xsl/index.xml",
        "xml.transform/sp.xsl/index.xml.DOM.canon",
        "xml.transform/sp.xsl/index.xml.DOM.tidy.xml",
        "xml.transform/sp.xsl/index.xml.SAX.canon",
        "xml.transform/sp.xsl/index.xml.SAX.tidy.xml",
        "xml.transform/sp.xsl/index.xml.Stream.canon",
        "xml.transform/sp.xsl/index.xml.Stream.tidy.xml",
        "xml.transform/sp.xsl/navigation.xml",
        "xml.transform/sp.xsl/pics/demo_background.gif",
        "xml.transform/sp.xsl/pics/deutsch.gif",
        "xml.transform/sp.xsl/pics/english.gif",
        "xml.transform/sp.xsl/pics/main.gif",
        "xml.transform/sp.xsl/pics/pixel.gif",
        "xml.transform/sp.xsl/pics/sources.gif",
        "xml.transform/sp.xsl/section2.xml",
        "xml.transform/sp.xsl/sources.d.xml",
        "xml.transform/sp.xsl/sources.xml",
        "xml.transform/sp.xsl/sp.xsl",
        "xml.transform/sp.xsl/spindex.xml",
        "xml.transform/spec-html/multiple.tmpl",
        "xml.transform/spec-html/multiple.xsl",
        "xml.transform/spec-html/xmlspec.xsl",
        "xml.transform/spec-html/xpath.xsl",
        "xml.transform/spec-html/xslt.xsl",
        "xml.transform/transformations.properties",
        "xml.transform/validity.xml.transform.dat",
        "xml.validation/docs.xsd",
        "xml.validation/much_adoxsd.xml",
        "xml.validation/periodic_table.xsd",
        "xml.validation/periodicxsd.xml",
        "xml.validation/personal.xml",
        "xml.validation/personal.xsd",
        "xml.validation/play.xsd",
        "xml.validation/po.xml",
        "xml.validation/po.xsd",
        "xml.validation/routes.xsd",
        "xml.validation/sales.xsd",
        "xml.validation/sampler.xsd",
        "xml.validation/structure.xml",
        "xml.validation/structure.xsd",
        "xml.validation/validation_input.xml",
        "xml.validation/validation_input.xsd",
        "xml.validation/validity.xml.validation.dat",
        "xml.validation/workload.xsd",
        "xml.validation/xml.xsd",
    };


    private final static byte[][] resourceDigests = {
        { -35, -101, 89, -110, 62, -14, 124, 117, -38, 65 },
        { -111, -126, 64, -89, 115, 11, 112, 104, 119, -19 },
        { 114, -40, 30, 110, -9, 92, 78, -128, 33, 63 },
        { -101, 4, 42, 30, 105, -96, 125, -16, -46, -48 },
        { 122, -74, 42, -111, -119, 116, 84, 22, 88, 4 },
        { 111, 29, 120, -5, -32, 74, -8, -92, 91, 115 },
        { 55, 14, -45, -106, 123, -76, 2, 92, 86, 116 },
        { -69, -82, -79, -87, -86, 67, 90, 30, -49, -33 },
        { -59, 54, -49, -101, 41, 65, -102, 87, -38, 98 },
        { 66, -123, 16, 30, -23, 52, -10, -59, -7, 29 },
        { 115, 10, 85, 69, -63, -120, 44, 39, -5, 77 },
        { -79, 19, 116, -74, -81, 82, 7, 52, -36, 122 },
        { -23, -69, -121, -45, -108, 105, 47, -49, 85, 126 },
        { 52, 17, -34, -27, -90, 34, 86, -42, -2, 40 },
        { -111, 54, 111, -43, 4, -50, -124, 101, -61, 113 },
        { -60, 114, -55, -61, -83, 28, 93, 122, -96, -108 },
        { -25, -12, -23, -17, -105, -58, -5, 65, 126, 110 },
        { 2, -59, -80, 24, 127, 49, -51, -115, -72, 39 },
        { 115, -56, 7, -89, -86, 95, 16, -116, 35, 31 },
        { 89, 51, 100, -61, -128, -25, 4, 126, 77, -76 },
        { -121, -76, 16, -125, 118, 40, 25, -31, -125, 78 },
        { 59, -18, -19, -124, -18, -109, -49, 111, 22, 118 },
        { 13, -120, -47, 8, 85, 39, -24, -35, 103, -51 },
        { -43, 127, 52, -109, -92, 45, -97, 46, 66, 15 },
        { 16, -66, 119, -117, -89, -20, -85, 2, 123, -105 },
        { 118, -1, 30, 34, 61, 61, -115, -40, 51, 101 },
        { -41, 84, 1, -121, -9, 44, -36, 24, -47, -100 },
        { -119, 76, 90, -33, 114, 101, -62, 79, -126, -101 },
        { -96, -74, 89, 57, 103, 11, -62, -64, 16, -12 },
        { 63, 88, -120, -58, 101, -33, -91, -75, 67, 100 },
        { 55, -56, -40, 80, 21, -122, -92, -25, 87, 26 },
        { -3, -71, -27, -105, -55, 82, 84, 99, 119, -104 },
        { 16, -66, 119, -117, -89, -20, -85, 2, 123, -105 },
        { 99, -39, 42, -6, -16, -59, -119, -107, -57, 16 },
        { -20, -18, -100, -42, -15, -90, 97, 83, -117, -70 },
        { 112, 24, -30, -39, -110, 68, 96, 68, 65, -28 },
        { -33, 99, 105, -17, -61, -127, 16, -100, -65, -75 },
        { -33, 99, 105, -17, -61, -127, 16, -100, -65, -75 },
        { -12, 60, -23, -10, -6, 22, 8, -15, 55, 99 },
        { -33, 99, 105, -17, -61, -127, 16, -100, -65, -75 },
        { -33, 99, 105, -17, -61, -127, 16, -100, -65, -75 },
        { -71, -31, 60, 6, -87, -39, 88, -99, -40, 25 },
        { -38, 57, -93, -18, 94, 107, 75, 13, 50, 85 },
        { -87, -88, 6, 72, 72, 45, 118, -2, 2, -66 },
        { 103, -11, -30, -34, 22, -66, -73, -90, -2, -2 },
        { 103, -11, -30, -34, 22, -66, -73, -90, -2, -2 },
        { -123, 97, 57, 7, -126, -46, -5, -1, 87, -51 },
        { -123, 97, 57, 7, -126, -46, -5, -1, 87, -51 },
        { -123, 97, 57, 7, -126, -46, -5, -1, 87, -51 },
        { 80, 6, 40, 99, 73, 9, -85, -95, -34, 34 },
        { -76, 82, 51, 4, 73, 36, 96, -34, 59, 55 },
        { 119, 3, -43, -54, 20, 20, -53, 11, 111, -25 },
        { 41, 26, -81, 74, -118, -58, -69, 19, -64, -35 },
        { 119, 3, -43, -54, 20, 20, -53, 11, 111, -25 },
        { 41, 26, -81, 74, -118, -58, -69, 19, -64, -35 },
        { 119, 3, -43, -54, 20, 20, -53, 11, 111, -25 },
        { 41, 26, -81, 74, -118, -58, -69, 19, -64, -35 },
        { -16, 127, -52, 105, -100, -3, 118, 29, 113, 38 },
        { -89, -8, -13, 121, -113, -41, -64, 60, 99, 17 },
        { 116, 50, 117, -14, -123, 13, -9, 86, 7, 24 },
        { -43, 50, 46, -106, -85, -128, 11, 14, 54, 10 },
        { -43, 50, 46, -106, -85, -128, 11, 14, 54, 10 },
        { -43, 50, 46, -106, -85, -128, 11, 14, 54, 10 },
        { -45, -118, 57, -19, -72, -65, 21, 39, 109, 10 },
        { -89, -72, -63, -33, 64, 20, -116, -12, -1, -53 },
        { -67, 105, 100, -33, 108, -41, -127, -33, -107, -44 },
        { -2, -127, -42, -45, 58, -43, -3, 39, 40, -48 },
        { 79, 32, 8, -88, 110, -114, 22, -10, 114, 102 },
        { 73, -36, 32, -13, 77, 61, -52, 28, -86, -1 },
        { -57, -68, -11, 86, 39, 88, 120, -64, 3, -105 },
        { 73, -36, 32, -13, 77, 61, -52, 28, -86, -1 },
        { -57, -68, -11, 86, 39, 88, 120, -64, 3, -105 },
        { 73, -36, 32, -13, 77, 61, -52, 28, -86, -1 },
        { -57, -68, -11, 86, 39, 88, 120, -64, 3, -105 },
        { -127, -41, 72, -70, -85, 24, -117, -93, -81, -91 },
        { 32, 10, -28, 69, -61, 69, 52, -32, -104, 121 },
        { -67, 57, -49, 61, -3, -84, -69, 28, -6, -113 },
        { 32, 10, -28, 69, -61, 69, 52, -32, -104, 121 },
        { -67, 57, -49, 61, -3, -84, -69, 28, -6, -113 },
        { 32, 10, -28, 69, -61, 69, 52, -32, -104, 121 },
        { -67, 57, -49, 61, -3, -84, -69, 28, -6, -113 },
        { -63, -59, 104, 5, 124, -75, -105, -116, 113, 122 },
        { -96, -44, -16, -1, 106, -84, 83, -76, -54, 95 },
        { 45, 45, -80, -36, 107, -56, -57, 26, -48, 67 },
        { 102, -99, 102, 98, -29, 19, -104, -34, 22, -10 },
        { 45, 45, -80, -36, 107, -56, -57, 26, -48, 67 },
        { 102, -99, 102, 98, -29, 19, -104, -34, 22, -10 },
        { 45, 45, -80, -36, 107, -56, -57, 26, -48, 67 },
        { 102, -99, 102, 98, -29, 19, -104, -34, 22, -10 },
        { 70, -11, 34, 107, 84, 2, -111, 8, 25, 83 },
        { 70, -31, 94, 113, -10, -35, 114, -112, 58, 42 },
        { -7, -110, 11, -98, -66, 6, 20, -91, -30, 62 },
        { -98, -89, -83, 34, 70, 125, 19, 50, 119, -70 },
        { -75, 71, -17, 66, -48, -36, -128, -113, -101, -101 },
        { -75, 71, -17, 66, -48, -36, -128, -113, -101, -101 },
        { -75, 71, -17, 66, -48, -36, -128, -113, -101, -101 },
        { -26, -36, -84, 36, 121, -108, 107, 115, 13, 22 },
        { 18, -80, 89, 24, -63, 72, 80, -120, -20, -33 },
        { -46, 33, -49, -99, 74, 103, 96, -67, 111, 9 },
        { -121, -1, 95, -126, 30, -35, -126, -10, -37, 34 },
        { 113, 54, -128, 45, -125, 66, 109, -117, -6, -112 },
        { 113, 54, -128, 45, -125, 66, 109, -117, -6, -112 },
        { 113, 54, -128, 45, -125, 66, 109, -117, -6, -112 },
        { 82, 96, 115, -92, -96, -127, -11, 96, -108, 34 },
        { -79, -103, 82, 38, 91, -56, -15, 13, -22, 28 },
        { 25, 90, -22, -47, -85, -106, -3, 106, 16, -83 },
        { -33, -116, -72, 117, 125, 124, -61, 14, -35, 100 },
        { -33, -116, -72, 117, 125, 124, -61, 14, -35, 100 },
        { -33, -116, -72, 117, 125, 124, -61, 14, -35, 100 },
        { -105, -72, 68, 23, 13, -86, -94, 75, -61, -41 },
        { 25, 107, 59, -56, 9, -121, -77, 87, -128, -21 },
        { -36, -67, -21, 24, -93, -21, -20, 42, -79, 23 },
        { -53, -59, -105, -117, 17, -86, -41, -62, 32, -60 },
        { -3, 54, 86, -91, 108, -67, -118, -89, 15, 85 },
        { -53, -59, -105, -117, 17, -86, -41, -62, 32, -60 },
        { -3, 54, 86, -91, 108, -67, -118, -89, 15, 85 },
        { -53, -59, -105, -117, 17, -86, -41, -62, 32, -60 },
        { -3, 54, 86, -91, 108, -67, -118, -89, 15, 85 },
        { -106, -121, 94, 52, -123, -25, -23, -97, 119, 109 },
        { 25, 55, -95, -118, -40, -69, -94, 106, -102, 105 },
        { -71, -30, -128, 64, -34, -99, -121, 115, -59, -80 },
        { 51, 20, -106, -14, 75, 90, 26, 49, 31, -81 },
        { -72, -60, -79, -55, 66, -113, 43, 90, -126, 30 },
        { 93, -20, -61, -6, -128, 94, -68, 12, -24, 2 },
        { -124, -8, 112, 83, 86, -97, -101, 96, 109, 19 },
        { 80, 16, -87, 113, 50, -4, -43, -96, -39, 16 },
        { -124, -8, 112, 83, 86, -97, -101, 96, 109, 19 },
        { 80, 16, -87, 113, 50, -4, -43, -96, -39, 16 },
        { -124, -8, 112, 83, 86, -97, -101, 96, 109, 19 },
        { 80, 16, -87, 113, 50, -4, -43, -96, -39, 16 },
        { 65, -125, -76, 94, -6, 33, 3, -8, -44, 41 },
        { -119, 89, -95, -62, 108, 115, 14, -39, 30, -41 },
        { 120, -81, -23, -122, -119, -31, -113, 38, -69, 35 },
        { -123, -32, -117, -100, 43, 51, 62, -83, -44, 105 },
        { 57, 113, 34, -64, -33, -98, -110, 92, -96, -89 },
        { -72, 11, 17, 32, 61, -105, -2, 1, -59, 89 },
        { 54, 122, -82, 12, -88, 17, 45, 120, -39, -38 },
        { 58, 32, 47, 81, 30, -118, -43, 26, 63, 15 },
        { 61, -58, -112, -109, -94, -41, -87, 13, 1, -54 },
        { -57, 65, 107, 74, -111, 39, 88, -77, 57, -3 },
        { -94, 97, 72, 122, -23, -11, -121, -72, -18, -33 },
        { 50, -47, -84, -118, 52, 7, -54, -106, 0, -113 },
        { -123, -86, 45, -92, 111, 16, -109, 95, -120, 110 },
        { 48, -35, -23, 107, 31, 16, -8, -20, -63, 69 },
        { 109, -127, -36, 49, -94, 109, -47, -101, 23, -10 },
        { -11, -111, -118, -46, 81, -62, -74, -31, 117, 101 },
        { 0, -69, -1, 98, -15, -33, 65, 15, -16, -75 },
        { 83, 39, 68, 88, 86, -67, 62, 124, 95, -72 },
        { 110, 38, 76, -110, -30, -53, -103, -28, -26, 78 },
        { -76, -57, -24, 50, 83, -122, -82, 93, 12, -116 },
        { 11, 79, 10, -69, -26, 26, -118, 13, -85, -76 },
        { 116, 76, -12, -34, 7, 10, 120, -87, -102, 46 },
        { -88, -104, -54, -9, 66, -18, 35, 114, 3, -89 },
        { 50, -88, -37, -125, -76, 106, -122, 126, -128, -45 },
        { 15, 127, 66, -67, 86, -39, 9, -9, -92, -8 },
        { -69, 80, 16, 21, 35, 15, 29, 37, -108, 50 },
        { -80, 123, 79, -82, 63, -120, 34, 96, -101, 81 },
        { -114, 15, 108, -34, 110, 95, -23, -89, -112, 31 },
        { -107, -54, -122, 117, 120, 23, 34, 50, -44, -25 },
        { 38, 122, 82, -39, -17, -97, 69, -54, -67, 84 },
        { -53, -107, -115, 44, 58, 94, -91, -28, 68, -38 },
        { 33, -2, 55, 127, -70, -99, 93, 96, -34, -78 },
        { 111, -114, 89, -98, -77, 49, 45, -67, -93, -25 },
        { -128, -45, 48, 46, -117, -108, 110, -28, 27, -27 },
        { 25, -32, -22, -27, -31, -88, 105, 93, 0, -123 },
        { -89, 47, 74, 85, -21, 100, -59, 39, -97, -75 },
        { 103, -69, 41, -52, 14, 53, 73, 0, 2, -101 },
        { 31, 71, -2, -35, 121, 4, -11, 25, -127, 20 },
    };


    /******
     * End of generated digests
     ******/


    public ExpectedResourceDigests(){ 
	//	if( !jarHM ) {

	hm = new HashMap<String, byte[]>();
	
	// Insert resource file-digest pairs
	for (int i=0; i < resources.length; i++) {
	    hm.put(resources[i], resourceDigests[i]);
	}
	//	}

    }     

    public Iterator<String> iterator() {
	return hm.keySet().iterator();
    }

    public byte[] getArray(String key){ 
	return hm.get(key);
    } 
} 
