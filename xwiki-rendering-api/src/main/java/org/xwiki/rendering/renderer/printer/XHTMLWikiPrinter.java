/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.rendering.renderer.printer;

/**
 * Base toolkit class for all XHTML-based renderers. This printer handles whitespaces so that it prints "&nbsp;" when
 * needed (i.e. when the spaces are at the beginning or at the end of an element's content or when there are more than 1
 * contiguous spaces, except for CDATA sections and inside PRE elements. It also knows how to handle XHTML comments).
 * 
 * @version $Id$
 * @since 1.7M1
 */
public interface XHTMLWikiPrinter extends XMLWikiPrinter
{
    public void printSpace();
}
