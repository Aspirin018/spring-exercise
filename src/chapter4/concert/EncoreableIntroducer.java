package chapter4.concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by liyu on 2017/7/24.
 */
@Aspect
public class EncoreableIntroducer {
    //valueָ������Щ��Ҫ����ӿڣ���ԭ�е�Ŀ���ࣻ defaultImpl��ʾ����ӿڵ�ʵ����
    @DeclareParents(value = "chapter4.concert.Performance+", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;//Ҫ����Ľӿ�

    //����ӿں󣬵���ί�и��������bean���ǽӿڵ�ʵ�֣�ȡ���ڵ��õķ�������˭
}
