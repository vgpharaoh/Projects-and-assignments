using System.Collections;
using System.Collections.Generic;
using UnityEngine;

    public class AnimThreeTest : MonoBehaviour
    {
       public AnimationClip aniClip0;
        public AnimationClip aniClip1;
        public AnimationClip aniClip2;
    public AnimationClip aniClip3;
    private GameObject parent;
        private AnimationClip aniClip;
        private int objStateMode = 0;

        void OnMouseDown()
        {
            if (objStateMode == 0)
            { aniClip = aniClip0; objStateMode++; }
            else if (objStateMode == 1)
            { aniClip = aniClip1; objStateMode++; }
        else if (objStateMode == 2)
        { aniClip = aniClip2; objStateMode++; }
        else
            { aniClip = aniClip3; objStateMode = 0; }

            if (GetComponent<Animation>())
                GetComponent<Animation>().Play(aniClip.name);
        }
    }


