/**
 * (C) 2002 Shaven Puppy Ltd
 * 
 * CoreGL14.java Created on Aug 1, 2002 by foo
 */
package org.lwjgl.opengl;

/**
 * The core OpenGL1.4 API, with no extensions.
 * 
 * @author foo
 */
public class CoreGL14 extends BaseGL implements CoreGL14Constants {
	
	/**
	 * Constructor for CoreGL14.
	 */
	public CoreGL14(
		int colorBits,
		int alphaBits,
		int depthBits,
		int stencilBits) {
		super(colorBits, alphaBits, depthBits, stencilBits);
	}

	public native void glAccum(int op, float value);
	public native void glAlphaFunc(int func, float ref);
	public native void glClearColor(float red, float green, float blue, float alpha);
	public native void glClearAccum(float red, float green, float blue, float alpha);
	public native void glClear(int mask);
	public native void glCallLists(int n, int type, int lists);
	public native void glCallList(int list);
	public native void glBlendFunc(int sfactor, int dfactor);
	public native void glBlendColorEXT(float red, float green, float blue, float alpha);
	public native void glBitmap(int width, int height, float xorig, float yorig, float xmove, float ymove, int bitmap);
	public native void glBindTexture(int target, int texture);
	public native void glBegin(int mode);
	public native void glEnd();
	public native void glArrayElement(int i);
	public native boolean glAreTexturesResident(int n, int residences);
	public native void glClearDepth(double depth);
	public native void glDeleteLists(int list, int range);
	public native void glDeleteTextures(int n, int textures);
	public native void glCullFace(int mode);
	public native void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height);
	public native void glCopyTexSubImage1D(int target, int level, int xoffset, int x, int y, int width);
	public native void glCopyTexImage2D(int target, int level, int internalFormat, int x, int y, int width, int height, int border);
	public native void glCopyTexImage1D(int target, int level, int internalFormat, int x, int y, int width, int border);
	public native void glCopyPixels(int x, int y, int width, int height, int type);
	public native void glColorPointer(int size, int type, int stride, int pointer);
	public native void glColorMaterial(int face, int mode);
	public native void glColorMask(boolean red, boolean green, boolean blue, boolean alpha);
	public native void glColor3b(byte red, byte green, byte blue);
	public native void glColor3d(double red, double green, double blue);
	public native void glColor3f(float red, float green, float blue);
	public native void glColor3i(int red, int green, int blue);
	public native void glColor3s(short red, short green, short blue);
	public native void glColor3ub(byte red, byte green, byte blue);
	public native void glColor3ui(int red, int green, int blue);
	public native void glColor3us(short red, short green, short blue);
	public native void glColor4b(byte red, byte green, byte blue, byte alpha);
	public native void glColor4d(double red, double green, double blue, double alpha);
	public native void glColor4f(float red, float green, float blue, float alpha);
	public native void glColor4i(int red, int green, int blue, int alpha);
	public native void glColor4s(short red, short green, short blue, short alpha);
	public native void glColor4ub(byte red, byte green, byte blue, byte alpha);
	public native void glColor4ui(int red, int green, int blue, int alpha);
	public native void glColor4us(short red, short green, short blue, short alpha);
	public native void glClipPlane(int plane, int equation);
	public native void glClearStencil(int s);
	public native void glClearIndex(float c);
	public native void glEvalPoint1(int i);
	public native void glEvalPoint2(int i, int j);
	public native void glEvalMesh1(int mode, int i1, int i2);
	public native void glEvalMesh2(int mode, int i1, int i2, int j1, int j2);
	public native void glEvalCoord1d(double u);
	public native void glEvalCoord1f(float u);
	public native void glEvalCoord2d(double u, double v);
	public native void glEvalCoord2f(float u, float v);
	public native void glEvalCoord1dv(int u);
	public native void glEvalCoord1fv(int u);
	public native void glEvalCoord2dv(int u);
	public native void glEvalCoord2fv(int u);
	public native void glEnableClientState(int cap);
	public native void glDisableClientState(int cap);
	public native void glEnable(int cap);
	public native void glDisable(int cap);
	public native void glEdgeFlagPointer(int stride, int pointer);
	public native void glEdgeFlag(boolean flag);
	public native void glEdgeFlagv(int flag);
	public native void glDrawPixels(int width, int height, int format, int type, int pixels);
	public native void glDrawElements(int mode, int count, int type, int indices);
	public native void glDrawBuffer(int mode);
	public native void glDrawArrays(int mode, int first, int count);
	public native void glDepthRange(double zNear, double zFar);
	public native void glDepthMask(boolean flag);
	public native void glDepthFunc(int func);
	public native void glFeedbackBuffer(int size, int type, int buffer);
	public native void glGetPixelMapfv(int map, int values);
	public native void glGetPixelMapuiv(int map, int values);
	public native void glGetPixelMapusv(int map, int values);
	public native void glGetMaterialfv(int face, int pname, int params);
	public native void glGetMaterialiv(int face, int pname, int params);
	public native void glGetMapdv(int target, int query, int v);
	public native void glGetMapfv(int target, int query, int v);
	public native void glGetMapiv(int target, int query, int v);
	public native void glGetLightfv(int light, int pname, int params);
	public native void glGetLightiv(int light, int pname, int params);
	public native int glGetError();
	public native void glGetClipPlane(int plane, int equation);
	public native void glGetBooleanv(int pname, int params);
	public native void glGetDoublev(int pname, int params);
	public native void glGetFloatv(int pname, int params);
	public native void glGetIntegerv(int pname, int params);
	public native void glGenTextures(int n, int textures);
	public native int glGenLists(int range);
	public native void glFrustum(double left, double right, double bottom, double top, double zNear, double zFar);
	public native void glFrontFace(int mode);
	public native void glFogf(int pname, float param);
	public native void glFogi(int pname, int param);
	public native void glFogfv(int pname, int params);
	public native void glFogiv(int pname, int params);
	public native void glFlush();
	public native void glFinish();
	public native void glGetPointerv(int pname, int params);
	public native boolean glIsEnabled(int cap);
	public native void glInterleavedArrays(int format, int stride, int pointer);
	public native void glInitNames();
	public native void glIndexPointer(int type, int stride, int pointer);
	public native void glIndexMask(int mask);
	public native void glIndexd(double c);
	public native void glIndexf(float c);
	public native void glIndexi(int c);
	public native void glIndexs(short c);
	public native void glIndexub(byte c);
	public native void glIndexdv(int c);
	public native void glIndexfv(int c);
	public native void glIndexiv(int c);
	public native void glIndexsv(int c);
	public native void glIndexubv(int c);
	public native void glHint(int target, int mode);
	public native void glGetTexParameterfv(int target, int pname, int params);
	public native void glGetTexParameteriv(int target, int pname, int params);
	public native void glGetTexLevelParameterfv(int target, int level, int pname, int params);
	public native void glGetTexLevelParameteriv(int target, int level, int pname, int params);
	public native void glGetTexImage(int target, int level, int format, int type, int pixels);
	public native void glGetTexGendv(int coord, int pname, int params);
	public native void glGetTexGenfv(int coord, int pname, int params);
	public native void glGetTexGeniv(int coord, int pname, int params);
	public native void glGetTexEnvfv(int target, int pname, int params);
	public native void glGetTexEnviv(int target, int pname, int params);
	public native String glGetString(int name);
	public native void glGetPolygonStipple(int mask);
	public native boolean glIsList(int list);
	public native void glMaterialf(int face, int pname, float param);
	public native void glMateriali(int face, int pname, int param);
	public native void glMaterialfv(int face, int pname, int params);
	public native void glMaterialiv(int face, int pname, int params);
	public native void glMapGrid1d(int un, double u1, double u2);
	public native void glMapGrid1f(int un, float u1, float u2);
	public native void glMapGrid2d(int un, double u1, double u2, int vn, double v1, double v2);
	public native void glMapGrid2f(int un, float u1, float u2, int vn, float v1, float v2);
	public native void glMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, int points);
	public native void glMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, int points);
	public native void glMap1d(int target, double u1, double u2, int stride, int order, int points);
	public native void glMap1f(int target, float u1, float u2, int stride, int order, int points);
	public native void glLogicOp(int opcode);
	public native void glLoadName(int name);
	public native void glLoadMatrixd(int m);
	public native void glLoadMatrixf(int m);
	public native void glLoadIdentity();
	public native void glListBase(int base);
	public native void glLineWidth(float width);
	public native void glLineStipple(int factor, short pattern);
	public native void glLightModelf(int pname, float param);
	public native void glLightModeli(int pname, int param);
	public native void glLightModelfv(int pname, int params);
	public native void glLightModeliv(int pname, int params);
	public native void glLightf(int light, int pname, float param);
	public native void glLighti(int light, int pname, int param);
	public native void glLightfv(int light, int pname, int params);
	public native void glLightiv(int light, int pname, int params);
	public native boolean glIsTexture(int texture);
	public native void glMatrixMode(int mode);
	public native void glPolygonStipple(int mask);
	public native void glPolygonOffset(float factor, float units);
	public native void glPolygonMode(int face, int mode);
	public native void glPointSize(float size);
	public native void glPixelZoom(float xfactor, float yfactor);
	public native void glPixelTransferf(int pname, float param);
	public native void glPixelTransferi(int pname, int param);
	public native void glPixelStoref(int pname, float param);
	public native void glPixelStorei(int pname, int param);
	public native void glPixelMapfv(int map, int mapsize, int values);
	public native void glPixelMapuiv(int map, int mapsize, int values);
	public native void glPixelMapusv(int map, int mapsize, int values);
	public native void glPassThrough(float token);
	public native void glOrtho(double left, double right, double bottom, double top, double zNear, double zFar);
	public native void glNormalPointer(int type, int stride, int pointer);
	public native void glNormal3b(byte nx, byte ny, byte nz);
	public native void glNormal3d(double nx, double ny, double nz);
	public native void glNormal3f(float nx, float ny, float nz);
	public native void glNormal3i(int nx, int ny, int nz);
	public native void glNormal3s(short nx, short ny, short nz);
	public native void glNormal3bv(int v);
	public native void glNormal3dv(int v);
	public native void glNormal3fv(int v);
	public native void glNormal3iv(int v);
	public native void glNormal3sv(int v);
	public native void glNewList(int list, int mode);
	public native void glEndList();
	public native void glMultMatrixd(int m);
	public native void glMultMatrixf(int m);
	public native void glPrioritizeTextures(int n, int priorities);
	public native void glShadeModel(int mode);
	public native void glSelectBuffer(int size, int buffer);
	public native void glScissor(int x, int y, int width, int height);
	public native void glScaled(double x, double y, double z);
	public native void glScalef(float x, float y, float z);
	public native void glRotated(double angle, double x, double y, double z);
	public native void glRotatef(float angle, float x, float y, float z);
	public native int glRenderMode(int mode);
	public native void glRectd(double x1, double y1, double x2, double y2);
	public native void glRectf(float x1, float y1, float x2, float y2);
	public native void glRecti(int x1, int y1, int x2, int y2);
	public native void glRects(short x1, short y1, short x2, short y2);
	public native void glRectdv(int v2);
	public native void glRectfv(int v2);
	public native void glRectiv(int v2);
	public native void glRectsv(int v2);
	public native void glReadPixels(int x, int y, int width, int height, int format, int type, int pixels);
	public native void glReadBuffer(int mode);
	public native void glRasterPos2d(double x, double y);
	public native void glRasterPos2f(float x, float y);
	public native void glRasterPos2i(int x, int y);
	public native void glRasterPos2s(short x, short y);
	public native void glRasterPos3d(double x, double y, double z);
	public native void glRasterPos3f(float x, float y, float z);
	public native void glRasterPos3i(int x, int y, int z);
	public native void glRasterPos3s(short x, short y, short z);
	public native void glRasterPos4d(double x, double y, double z, double w);
	public native void glRasterPos4f(float x, float y, float z, float w);
	public native void glRasterPos4i(int x, int y, int z, int w);
	public native void glRasterPos4s(short x, short y, short z, short w);
	public native void glRasterPos2dv(int v);
	public native void glRasterPos2fv(int v);
	public native void glRasterPos2iv(int v);
	public native void glRasterPos2sv(int v);
	public native void glRasterPos3dv(int v);
	public native void glRasterPos3fv(int v);
	public native void glRasterPos3iv(int v);
	public native void glRasterPos3sv(int v);
	public native void glRasterPos4dv(int v);
	public native void glRasterPos4fv(int v);
	public native void glRasterPos4iv(int v);
	public native void glRasterPos4sv(int v);
	public native void glPushName(int name);
	public native void glPopName();
	public native void glPushMatrix();
	public native void glPopMatrix();
	public native void glPushClientAttrib(int mask);
	public native void glPopClientAttrib();
	public native void glPushAttrib(int mask);
	public native void glPopAttrib();
	public native void glStencilFunc(int func, int ref, int mask);
	public native void glVertexPointer(int size, int type, int stride, int pointer);
	public native void glVertex2d(double x, double y);
	public native void glVertex2f(float x, float y);
	public native void glVertex2i(int x, int y);
	public native void glVertex2s(short x, short y);
	public native void glVertex3d(double x, double y, double z);
	public native void glVertex3f(float x, float y, float z);
	public native void glVertex3i(int x, int y, int z);
	public native void glVertex3s(short x, short y, short z);
	public native void glVertex4d(double x, double y, double z, double w);
	public native void glVertex4f(float x, float y, float z, float w);
	public native void glVertex4i(int x, int y, int z, int w);
	public native void glVertex4s(short x, short y, short z, short w);
	public native void glVertex2dv(int v);
	public native void glVertex2fv(int v);
	public native void glVertex2iv(int v);
	public native void glVertex2sv(int v);
	public native void glVertex3dv(int v);
	public native void glVertex3fv(int v);
	public native void glVertex3iv(int v);
	public native void glVertex3sv(int v);
	public native void glVertex4dv(int v);
	public native void glVertex4fv(int v);
	public native void glVertex4iv(int v);
	public native void glVertex4sv(int v);
	public native void glTranslated(double x, double y, double z);
	public native void glTranslatef(float x, float y, float z);
	public native void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, int pixels);
	public native void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, int pixels);
	public native void glTexParameterf(int target, int pname, float param);
	public native void glTexParameteri(int target, int pname, int param);
	public native void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, int pixels);
	public native void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, int pixels);
	public native void glTexGend(int coord, int pname, double param);
	public native void glTexGenf(int coord, int pname, float param);
	public native void glTexGeni(int coord, int pname, int param);
	public native void glTexGendv(int coord, int pname, int params);
	public native void glTexGenfv(int coord, int pname, int params);
	public native void glTexGeniv(int coord, int pname, int params);
	public native void glTexEnvf(int target, int pname, float param);
	public native void glTexEnvi(int target, int pname, int param);
	public native void glTexEnvfv(int target, int pname, int params);
	public native void glTexEnviv(int target, int pname, int params);
	public native void glTexCoordPointer(int size, int type, int stride, int pointer);
	public native void glTexCoord1d(double s);
	public native void glTexCoord1f(float s);
	public native void glTexCoord1i(int s);
	public native void glTexCoord1s(short s);
	public native void glTexCoord2d(double s, double t);
	public native void glTexCoord2f(float s, float t);
	public native void glTexCoord2i(int s, int t);
	public native void glTexCoord2s(short s, short t);
	public native void glTexCoord3d(double s, double t, double r);
	public native void glTexCoord3f(float s, float t, float r);
	public native void glTexCoord3i(int s, int t, int r);
	public native void glTexCoord3s(short s, short t, short r);
	public native void glTexCoord4d(double s, double t, double r, double q);
	public native void glTexCoord4f(float s, float t, float r, float q);
	public native void glTexCoord4i(int s, int t, int r, int q);
	public native void glTexCoord4s(short s, short t, short r, short q);
	public native void glTexCoord1dv(int v);
	public native void glTexCoord1fv(int v);
	public native void glTexCoord1iv(int v);
	public native void glTexCoord1sv(int v);
	public native void glTexCoord2dv(int v);
	public native void glTexCoord2fv(int v);
	public native void glTexCoord2iv(int v);
	public native void glTexCoord2sv(int v);
	public native void glTexCoord3dv(int v);
	public native void glTexCoord3fv(int v);
	public native void glTexCoord3iv(int v);
	public native void glTexCoord3sv(int v);
	public native void glTexCoord4dv(int v);
	public native void glTexCoord4fv(int v);
	public native void glTexCoord4iv(int v);
	public native void glTexCoord4sv(int v);
	public native void glStencilOp(int fail, int zfail, int zpass);
	public native void glStencilMask(int mask);
	public native void glViewport(int x, int y, int width, int height);

}


