package com.dcdz.weiyue.component;

import com.dcdz.weiyue.ui.jandan.view.JanDanDetailFragment;
import com.dcdz.weiyue.ui.news.ArticleReadActivity;
import com.dcdz.weiyue.ui.news.DetailFragment;
import com.dcdz.weiyue.ui.news.ImageBrowseActivity;
import com.dcdz.weiyue.ui.news.NewsFragment;
import com.dcdz.weiyue.ui.video.view.VideoDetailFragment;
import com.dcdz.weiyue.ui.video.view.VideoFragment;

import dagger.Component;
/**
 * 被标注了Component的接口在编译时会产生相应的类的实例来作为提供依赖方和需要依赖方之间的桥梁，把相关依赖注入到其中
 * 用inject标注的变量为依赖需求方
*/

@Component(dependencies = ApplicationComponent.class)
public interface HttpComponent {

    //如果需要用给JanDanDetailFragment注入，还需要一个inject方法，里面传入我们的JanDanDetailFragment对象的实例
    void inject(VideoFragment videoFragment);

    void inject(VideoDetailFragment videoDetailFragment);

    void inject(JanDanDetailFragment jdDetailFragment);

    void inject(ImageBrowseActivity imageBrowseActivity);

    void inject(DetailFragment detailFragment);

    void inject(ArticleReadActivity articleReadActivity);

    //注意!这里开始一直编译报错，最后发现是NewsFragment继承BaseFragment时没用添加泛型
    void inject(NewsFragment newsFragment);

}
