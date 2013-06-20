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
package org.xwiki.rendering.configuration;

import org.xwiki.component.annotation.Role;

import java.util.List;
import java.util.Properties;

/**
 * Configuration properties for the Rendering module.
 * <p>
 * You can override the default values for each of the configuration properties below by defining them in XWiki's
 * global configuration file using a prefix of "rendering" followed by the property name. For example:
 * <code>rendering.linkLabelFormat = %s.%p</code>
 *
 * @version $Id$
 * @since 1.6M1
 */
@Role
public interface RenderingConfiguration
{
    /**
     * A link label format is the format used to decide how to display links that have no label.
     * By default the page name is displayed. However it's possible to customize it using the
     * following tokens:
     * <ul>
     *   <li><strong>%w</strong>: wiki name</li>
     *   <li><strong>%s</strong>: space name</li>
     *   <li><strong>%p</strong>: page name</li>
     *   <li><strong>%P</strong>: page name with spaces between camel case words, i.e. "My Page" 
     *       if the page name is "MyPage"</li>
     *   <li><strong>%t</strong>: page title</li>
     * </ul>
     * Note that if the page title is empty or not defined then it defaults to %p. This is also the case
     * if the title cannot be retrieved for the document.
     * 
     * The default is "%p". Some examples: "%s.%p", "%w:%s.%p".
     *
     * @return the format to use to display link labels when the user hasn't specified a label
     */
    String getLinkLabelFormat();

    /**
     * @return the list of InterWiki definitions. Each InterWiki definition is made of an alias and a base URL.
     * @see org.xwiki.rendering.listener.reference.InterWikiResourceReference
     */
    Properties getInterWikiDefinitions();

    /**
     * @return the names of transformations to execute when rendering document content, ordered by transformation
     *         priority (highest priority first)
     * @since 3.3M1
     */
    List<String> getTransformationNames();
    
    /**
     * 
     * @return the hint defining the XHTML printer to use.
     * @since 5.1RC1
     */
    String getXHTMLWikiPrinterHint();
}
