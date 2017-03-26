﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Windows;
using System.Windows.Controls;
using WPF = System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Threading.Tasks;

namespace AdaptiveCards.Renderers
{
    public partial class XamlRenderer
        : AdaptiveRenderer<FrameworkElement, RenderContext>
    {
        /// <summary>
        /// ImageSet
        /// </summary>
        /// <param name="imageSet"></param>
        /// <returns></returns>
        protected override FrameworkElement RenderImageSet(ImageSet imageSet, RenderContext context)
        {
            var uiImageSet = new ListBox();
            uiImageSet.Style = this.GetStyle("Adaptive.ImageSet");

            ScrollViewer.SetHorizontalScrollBarVisibility(uiImageSet, ScrollBarVisibility.Disabled);
            var itemsPanelTemplate = new ItemsPanelTemplate();
            var factory = new FrameworkElementFactory(typeof(WrapPanel));
            // factory.SetValue(StackPanel.OrientationProperty, Orientation.Horizontal);
            itemsPanelTemplate.VisualTree = factory;
            uiImageSet.ItemsPanel = itemsPanelTemplate;

            foreach (var image in imageSet.Images)
            {
                if (imageSet.ImageSize != ImageSize.Auto)
                    image.Size = imageSet.ImageSize;
                var uiImage = this.RenderImage(image, context);
                uiImageSet.Items.Add(uiImage);
            }
            return uiImageSet;
        }


        //public override async Task PreRender()
        //{
        //    List<Task> tasks = new List<Task>();
        //    foreach (var item in this.Images)
        //        tasks.Add(item.PreRender());

        //    await Task.WhenAll(tasks.ToArray());
        //}

    }
}